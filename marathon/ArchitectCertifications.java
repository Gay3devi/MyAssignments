package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>confirmredirect=new ArrayList<String>(windowHandles);
		driver.switchTo().window(confirmredirect.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow dom=new Shadow(driver);
		dom.setImplicitWait(20);
		WebElement learning = dom.findElementByXPath(("//span[text()='Learning']"));
		learning.click();
		WebElement trialonhead = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions builder=new Actions(driver);
		builder.moveToElement(trialonhead).click().perform();
		Shadow dom1=new Shadow(driver);
		dom1.setImplicitWait(20);
		WebElement salesforce = dom1.findElementByXPath("//a[text()='Salesforce Certification']");
		Actions click=new Actions(driver);
		click.moveToElement(salesforce).click().perform();
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		List<WebElement> certification = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for(int i=0;i<certification.size();i++) {
			System.out.println("List of Certifications:" + certification.get(i).getText());
		}
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
	 List<WebElement> applcert = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
 for(int i=0;i<applcert.size();i++) {
	System.out.println("Application Architect certification:" + applcert.get(i).getText());
	}
 File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
 File dest=new File("./snap/CERTIFICATIONS1.png");
		    FileUtils.copyFile(screenshotAs, dest);
 
 
}}
