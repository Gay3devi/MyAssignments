package week5.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		//wait for visibility	
	 WebElement element = driver.findElement(By.id("j_idt87:j_idt89"));
	 element.click();
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.visibilityOf(element));
	 String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
	 System.out.println(text);
	 
	 //wait for invisibility
	 WebElement element2 = driver.findElement(By.id("j_idt87:j_idt92"));
	 element2.click();
	 WebElement findElement = driver.findElement(By.id("j_idt87:j_idt93"));
	 	 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait1.until(ExpectedConditions.invisibilityOf(findElement));
	// System.out.println(findElement);
	

	 //wait for clickability
	 driver.findElement(By.id("j_idt87:j_idt95")).click();
	 
	 WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Click Second']"));
	 WebDriverWait clicksecond=new WebDriverWait(driver, Duration.ofSeconds(10));
	 clicksecond.until(ExpectedConditions.elementToBeClickable(findElement2));
	 
	 
	 driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
	 WebElement findElement3 = driver.findElement(By.xpath("//span[text()='I am going to change!']"));
	 WebDriverWait waitforchange=new WebDriverWait(driver,Duration.ofSeconds(20));
	 waitforchange.until(ExpectedConditions.textToBePresentInElement(findElement3, "Did you notice?"));
	 String text2 = driver.findElement(By.xpath("//span[text()='Did you notice?']")).getText();
	 System.out.println(text2);
	 driver.close();
	 }
}
