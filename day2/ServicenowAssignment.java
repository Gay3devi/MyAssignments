package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ServicenowAssignment extends LearnStaticDataParameterization{ 

	/*public static void main(String[] ) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev99201.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("user_name")).sendKeys("");
		driver.findElement(By.id("user_password")).sendKeys("KdRcF-kgT9=3");
		driver.findElement(By.id("sysverb_login")).click();
*/		
	
	
		
		
	@Test	
	public void runServiceNow() {
		
		Shadow dom=new Shadow(driver);
		dom.setImplicitWait(20);
		WebElement all = dom.findElementByXPath("//div[text()='All']");
		all.click();
		
		Shadow dom1=new Shadow(driver);
		dom1.setImplicitWait(30);
		WebElement service = dom1.findElementByXPath("//span[text()='Service Catalog']");
		service.click();
		
		Shadow frame=new Shadow(driver);
		frame.setImplicitWait(20);
		WebElement element2 = frame.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(element2);
		
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		driver.findElement(By.xpath("//label[text()='No']")).click();
		WebElement element = driver.findElement(By.xpath("//select[@class='form-control cat_item_option '] "));
		
		Select drop=new Select(element);
		element.click();
		drop.selectByValue("unlimited");
		driver.findElement(By.xpath("//label[text()='Gold']")).click();
		driver.findElement(By.xpath("//label[text()='128 GB']")).click();
		driver.findElement(By.id("oi_order_now_button")).click();
		
		String text = driver.findElement(By.xpath("//dl[@class='dl-horizontal sc-dl-horizontal']")).getText();
	System.out.println("orderplaceddetails:" + text);
	//	driver.close();
	}

}

