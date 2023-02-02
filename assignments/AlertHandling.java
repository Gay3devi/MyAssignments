package week4.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

public static void main(String[] args)  {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.leafground.com/alert.xhtml");

//simple dialog alert
driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-outlined'][1]")).click();
Alert alert = driver.switchTo().alert();
alert.accept();

//Confirm dialog alert
driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-warning']")).click();
Alert alert2 = driver.switchTo().alert();
alert2.accept();

//
driver.findElement(By.id("j_idt88:j_idt95")).click();
driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
System.out.println("closed the alert");

//prompt alert
driver.findElement(By.id("j_idt88:j_idt104")).click();
Alert alert3 = driver.switchTo().alert();
alert3.sendKeys("TestLeaf");
alert3.accept();

//sweet alert confirmation

driver.findElement(By.id("j_idt88:j_idt106")).click();
WebElement confirmation = driver.findElement(By.xpath("//span[text()='Yes']"));
confirmation.click();
String text2 = confirmation.getText();
System.out.println(text2);

//minimize and maximize

driver.findElement(By.id("j_idt88:j_idt111")).click();
//driver.findElement(By.xpath("(//a[@role='button'])[4]")).click();
//driver.switchTo().alert();
driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
	}

}
