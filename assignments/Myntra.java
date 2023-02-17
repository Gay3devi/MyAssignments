package week5.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(options);
		
		
		// Open https://www.myntra.com/
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Mouse hover on MeN 
		WebElement mousehover = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(mousehover).perform();
		
		// Click Jackets
		driver.findElement(By.xpath("(//a[text()='Jackets'])[1]")).click();
		
		
		//Find the total count of item 
		
		String text = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println(text);
		
		
		
		// Validate the sum of categories count matches
		
		String text2 = driver.findElement(By.xpath("//ul[@class='categories-list']")).getText();
		System.out.println(text2);
		
		//6) Check jackets
		
		driver.findElement(By.xpath("//label[@class='common-customCheckbox vertical-filters-label'][1]")).click();
		
		//7) Click + More option under BRAND
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		
		//8) Type Duke and click checkbox
		
		//driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("Duke");
		
	//	Thread.sleep(3000);
		//WebElement scroll = driver.findElement(By.xpath("//input[@value='Duke']"));
		//scroll.click();
	
		
		
		//Actions builder1=new Actions(driver);
		//builder1.moveToElement(scroll).click().perform();
		
		//driver.findElement(By.xpath("(//input[@value='Duke'])[2]")).click();
		
		//close the popup x
		//driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		
		//List<WebElement> checkduke = driver.findElements(By.xpath("//h3[text()='Duke']"));
		
	//	for(int i=0;i<checkduke.size();i++) {
			
		//	System.out.println("To check the duke  brand selected in this page:" + checkduke.get(i).getText());
		//}
		
		
		
		
		//
		
		//9) Close the pop-up x
		//10) Confirm all the Coats are of brand Duke
		//    Hint : use List 
		//11) Sort by Better Discount
		//12) Find the price of first displayed item
		//Click on the first product
		//13) Take a screen shot
		//14) Click on WishList Now
		//15) Close Browser

		
		
		
	}

}
