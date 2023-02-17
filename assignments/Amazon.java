package week5.day1.assignments;

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

public class Amazon {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//search as oneplus 9 pro 
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
	
	//.Get the price of the first product
	

	String text = driver.findElement(By.xpath("(//span[text()='48,999'])[1]")).getText();
	System.out.println("The first product price :"+ text);

	 //Print the number of customer ratings for the first displayed product 	
	String text2 = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
	System.out.println("Number of Customers Ratings:"+ text2);
	
	//mousehover
	WebElement mousehover = driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative'])[1]"));
	
	Actions builder=new Actions(driver);//(//i[@class='a-icon a-icon-star-small a-star-small-3 aok-align-bottom'])[1]
    builder.moveToElement(mousehover).click().perform();
    
    // Get the percentage of ratings for the 5 star.
    
    //driver.findElement(By.xpath("//a[contains(text(),' 5 star')] ")).click();
    //String text3 = driver.findElement(By.xpath("((//a[@title='5 stars represent 50% of rating'])[3]")).getText();
    //System.out.println(text3);
    
    String text3 = driver.findElement(By.xpath("(//a[@title=\"5 stars represent 50% of rating\"])[3]")).getText();
    System.out.println(text3);
    //String text3 = driver.findElement(By.xpath("(//a[@title='5 stars represent 50% of rating'])[3]")).getText();
    //System.out.println("The percentage of 5 star ratings:"+ text3);
    // Click the first text link of the first image
    driver.findElement(By.xpath("//span[contains(text(),'(Renewed) OnePlus 9 Pro 5G (Pine Green, 12GB RAM,')]")).click();
    
    Set<String> handles = driver.getWindowHandles();
    List<String>list=new ArrayList<String>(handles);
    driver.switchTo().window(list.get(1));
    
    File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
    File dest=new File("./snap/amazon.png");
    FileUtils.copyFile(screenshotAs, dest);
    driver.findElement(By.id("add-to-cart-button")).click();
    
    String text4 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
    System.out.println(text4);
    System.out.println(text2);
    if(text.equals(text4)) {
    	System.out.println("The value is same");
    }else {
    System.out.println("The value is not same");
	}

}}
