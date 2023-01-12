package marathon.seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		String text2 = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']/parent::div")).getText();
		System.out.println(  text2);
		driver.findElement(By.xpath("//span[text()='American Tourister']/ancestor::a")).click();
		String text3 = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']/parent::div")).getText();
		System.out.println(text3);
		driver.findElement(By.id("a-autoid-0-announce")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		Thread.sleep(3000);
		String text4 = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']/parent::a")).getText();
		System.out.println(text4);
		}}


