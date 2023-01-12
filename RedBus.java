package marathon.seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		driver.findElement(By.xpath("//input[@tabindex='1']")).sendKeys("chennai");
		driver.findElement(By.xpath("//li[@data-id='123']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//li[@data-id='122']")).click();
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		driver.findElement(By.xpath("//td[@class='wd day']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']/ancestor::div[@class='sort-sec clearfix onward ']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		String text2 = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[2]")).click();
		String text3 = driver.findElement(By.xpath("(//div[@class='seat-left m-top-30\'])[2]")).getText();
		System.out.println(text3);
	}
	

}
