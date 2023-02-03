package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsAndFrames {

	public static void main(String[] args) throws InterruptedException  {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
WebElement element = driver.findElement(By.id("iframeResult"));
driver.switchTo().frame(element);
	driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
System.out.println(text);
	
	alert.accept();
driver.close();
}

	}





/*ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//handle the frame
WebElement element = driver.findElement(By.id("iframeResult"));
driver.switchTo().frame(element);
//Click Try It Button
driver.findElement(By.xpath("//button[text()='Try it']")).click();
//handle the alert
Alert alert = driver.switchTo().alert();//ctrl+2+1
String text = alert.getText();
System.out.println(text);//print text in the alert box
//Click OK/Cancel in the alert
alert.accept();

//Confirm the action is performed correctly by verifying the text !!
String text2 = driver.findElement(By.id("demo")).getText();
if(text2.contains("You pressed")) {
    System.out.println("Action is performed successfully");
}
*/