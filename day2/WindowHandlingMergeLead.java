package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingMergeLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Merge Leads")).click();
		
		 driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		 Set<String> windowHandles = driver.getWindowHandles();
		List<String>listwindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(listwindow.get(1));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//div/a[text()='Hari'])[1]")).click();
		
		//driver.close();
		driver.switchTo().window(listwindow.get(0));
		System.out.println(driver.getTitle());
		
		
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(click).click().perform();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String>listwindow1=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(listwindow1.get(1));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//div/a[text()='Hari'])[2]")).click();
		driver.switchTo().window(listwindow1.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		driver.switchTo().alert().accept();
		
			}

}
