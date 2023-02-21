package week6.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class CreateNewCaller  extends LearnStaticDataParameterization{
//public static void main(String[] args) {
	
	@Test
	public void runNewCaller() {

		/*
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		 * ChromeDriver(); driver.get("https://dev99201.service-now.com/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 * driver.findElement(By.id("user_name")).sendKeys("admin");
		 * driver.findElement(By.id("user_password")).sendKeys("KdRcF-kgT9=3");
		 * driver.findElement(By.id("sysverb_login")).click();
		 */  
	 Shadow dom = new Shadow(driver); dom.setImplicitWait(20); 
	 WebElement all = dom.findElementByXPath("//div[text()='All']");
	 all.click();
	  dom.setImplicitWait(20);
	 		
		dom.findElementByXPath("//input[@id='filter']").sendKeys("Callers",Keys.ENTER);


		Shadow dom1 = new Shadow(driver);
		dom1.setImplicitWait(20);
		dom1.findElementByXPath("//a[@aria-label='Callers']").click();
		
		
		Shadow root = new Shadow(driver);
		root.setImplicitWait(10);
		WebElement frame1 = root.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);

		driver.findElement(By.id("sysverb_new")).click();
		driver.findElement(By.id("sys_user.first_name")).sendKeys("Test",Keys.ENTER);
		driver.findElement(By.id("sys_user.last_name")).sendKeys("Leaf",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("gay3devi.k@gmail.com",Keys.ENTER);
		driver.findElement(By.id("lookup.sys_user.title")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		driver.findElement(By.linkText("Administrative Assistant")).click();
		driver.switchTo().window(window.get(0));
		
		Shadow button=new Shadow(driver);
		WebElement clicksubmit = button.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(clicksubmit);
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@aria-label='Email']/parent::span")).sendKeys("gay3devi.k@gmail.com",Keys.ENTER);
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		//driver.close();
		
	}

}
