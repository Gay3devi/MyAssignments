package week6.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class CreateNewProposal extends LearnStaticDataParameterization {

	//public static void main(String[] args) throws InterruptedException {
	@Test	
	public void runNewProposal() {
	//	WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver(options);
		//options.addArguments("--disable-notifications");
	
	/*
	 * driver.manage().window().maximize();
	 * driver.get("https://dev99201.service-now.com/");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //login
	 * driver.findElement(By.id("user_name")).sendKeys("admin");
	 * driver.findElement(By.id("user_password")).sendKeys("KdRcF-kgT9=3");
	 * 
	 * driver.findElement(By.id("sysverb_login")).click();
	 */
	  // click All 
	  Shadow dom = new Shadow(driver); dom.setImplicitWait(20);
	  WebElement all = dom.findElementByXPath("//div[text()='All']"); all.click();
	  dom.setImplicitWait(20);
	 
		// Click All and Enter Proposal in filter navigator and press enter
		
		dom.findElementByXPath("//input[@id='filter']").sendKeys("Proposal", Keys.ENTER);
		Shadow dom1 = new Shadow(driver);
		dom1.setImplicitWait(20);
		dom1.findElementByXPath("//mark[@class='filter-match']").click();

		//Click- new  and  fill mandatory fields and click 'Submit' 

		Shadow root = new Shadow(driver);
		root.setImplicitWait(10);
		WebElement frame1 = root.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);

		driver.findElement(By.id("sysverb_new")).click();
		
		//select template description
		driver.findElement(By.id("lookup.std_change_proposal.short_description")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));

		driver.findElement(By.linkText("Issue with networking")).click();
		
		driver.switchTo().window(window.get(0));
		
		Shadow button=new Shadow(driver);
		WebElement clicksubmit = button.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(clicksubmit);
		//click submit
		driver.findElement(By.id("sysverb_insert")).click();
		
		//driver.close();

	}

}
