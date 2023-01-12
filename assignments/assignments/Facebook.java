package week3.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://en-gb.facebook.com/");
driver.findElement(By.linkText("Create New Account")).click();
driver.findElement(By.xpath("//input[@tabindex='0']")).sendKeys("Gayathridevi");
driver.findElement(By.name("lastname")).sendKeys("K");
driver.findElement(By.name("reg_email__")).sendKeys("9677167632");
driver.findElement(By.id("password_step_input")).sendKeys("fhkj3322");

WebElement tool=driver.findElement(By.id("day"));
Select drop =new Select(tool);
tool.click();
drop.selectByValue("4");

WebElement tool1= driver.findElement(By.id("month"));
Select Drop1=new Select(tool1);
Drop1.selectByVisibleText("Jun");

WebElement tool2=driver.findElement(By.id("year"));
Select drop2=new Select(tool2);
drop2.selectByVisibleText("1984");
driver.findElement(By.className("_8esa")).click();
driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

Thread.sleep(2000);

driver.close();


	}

}
