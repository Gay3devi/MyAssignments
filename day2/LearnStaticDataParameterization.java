package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class LearnStaticDataParameterization {
	public ChromeDriver driver;
	public Shadow dom;

@Parameters({"url","username","password"})	
@BeforeMethod	
//public static void main(String[] args) {
	
public void runServiceNow(String url, String uname, String pwd) {

	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	//ChromeDriver driver = new ChromeDriver();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("user_name")).sendKeys(uname);
	driver.findElement(By.id("user_password")).sendKeys(pwd);
	driver.findElement(By.id("sysverb_login")).click();

	/*
	 * Shadow dom = new Shadow(driver); dom.setImplicitWait(20); WebElement all =
	 * dom.findElementByXPath("//div[text()='All']"); all.click();
	 * dom.setImplicitWait(20);
	 */

}

@AfterMethod
public void tearDown() {
	driver.close();
}
	
	}

