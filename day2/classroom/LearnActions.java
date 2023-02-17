package week5.day2.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://jqueryui.com/selectable/");
		 driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		 Actions builder = new Actions(driver);
builder.dragAndDrop(item5, item2).dragAndDrop(item6, item1).perform();
	       //builder.keyDown(Keys.CONTROL)
	        //.click(item1)
	       // .click(item3)
	        //.click(item5)
	       // .keyUp(Keys.CONTROL).perform();
		 
	
		 
	}

}
//handle the frame

//find the element
//ebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
//WebElement item2= driver.findElement(By.xpath("//li[text()='Item 2']"));
//WebElement item3= driver.findElement(By.xpath("//li[text()='Item 3']"));
//WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));

// Step1 : Create object for Actions class
 /*       Actions builder = new Actions(driver);
// step2: use appropriate method to do the action
//builder.clickAndHold(item1).moveToElement(item6).release().perform();
        builder.keyDown(Keys.CONTROL)
        .click(item1)
        .click(item3)
        .click(item5)
        .keyUp(Keys.CONTROL).perform();
// perform() is mandatory at the end of action
from aws-help@testleaf.com to everyone:    3:11 PM
//handle the frame
driver.switchTo().frame(0);
//find the element
WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
WebElement item2= driver.findElement(By.xpath("//li[text()='Item 2']"));
WebElement item3= driver.findElement(By.xpath("//li[text()='Item 3']"));
WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));

// Step1 : Create object for Actions class
        Actions builder = new Actions(driver);
        builder.dragAndDrop(item5,item1).dragAndDrop(item4,item2).perform();*/