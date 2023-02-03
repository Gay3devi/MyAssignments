package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class AdministratorCertifications {

	///private static final OutputType OutputType = null;
	//private static final String FILE = null;

	public static void main(String[] args) throws IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://login.salesforce.com/");
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
		String title = driver.getTitle();
		System.out.println(title);
		WebElement scroll = driver.findElement(By.xpath("(//div[@class='credentials-card '])[1]"));
		Actions scrolling=new Actions(driver);
		scrolling.scrollToElement(scroll).perform();
		 File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		    File dest=new File("./snap/CERTIFICATIONS.png");
		    FileUtils.copyFile(screenshotAs, dest);
			}
		
	}
