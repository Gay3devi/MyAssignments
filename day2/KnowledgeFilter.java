package week6.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class KnowledgeFilter extends LearnStaticDataParameterization {
@Test
	public void runKnowledgeFilter() throws InterruptedException {
		/*
		 * public static void main(String[] args) throws InterruptedException {
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		 * ChromeDriver(); driver.get("https://dev99201.service-now.com/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 * driver.findElement(By.id("user_name")).sendKeys("admin");
		 * driver.findElement(By.id("user_password")).sendKeys("KdRcF-kgT9=3");
		 * driver.findElement(By.id("sysverb_login")).click();
		 */  
		  Shadow dom = new Shadow(driver); dom.setImplicitWait(20); 
		  WebElement all =  dom.findElementByXPath("//div[text()='All']"); all.click();
		  dom.setImplicitWait(20);
		  
		 
		dom.findElementByXPath("//input[@id='filter']").sendKeys("knowledge", Keys.ENTER);
		Shadow dom1 = new Shadow(driver);
		dom1.setImplicitWait(20);
		dom1.findElementByXPath("//a[@aria-label='Knowledge']").click();

		Shadow button = new Shadow(driver);
		WebElement clicksubmit = button.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(clicksubmit);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		WebElement findElement = driver.findElement(By.id("lookup.kb_knowledge.kb_knowledge_base"));
		findElement.click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));

		driver.findElement(By.xpath("//a[text()='IT']")).click();
		driver.switchTo().window(window.get(0));
		driver.switchTo().frame(clicksubmit);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_category']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='IT']")).click();
		driver.findElement(By.xpath("//span[text()='Java']")).click();
		driver.findElement(By.id("ok_button")).click();

		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("IT Java");

		driver.findElement(By.id("sysverb_insert_bottom")).click();

		//driver.close();

	}

}
