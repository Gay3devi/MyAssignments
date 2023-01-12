package week2.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("ui-selectonemenu")).click();
		
		 WebElement drop=driver.findElement(By.className("ui-selectonemenu"));
		 Select down=new Select(drop);
		 down.selectByIndex(2);
		 
	//Selecting the county field
		 driver.findElement(By.xpath(".//label[@id='j_idt87:country_label']")).click();
		 driver.findElement(By.xpath(".//li[text()='Germany']")).click();
		 Thread.sleep(3000);
 
		 driver.findElement(By.xpath("//*[@id=\"j_idt87:city_label\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"j_idt87:city_items\"]/li[text()='Berlin']")).click();
		 
		 driver.findElement(By.className("ui-autocomplete-dropdown")).click();
		 driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul/li[text()='AWS']")).click();
		 
		 driver.findElement(By.id("j_idt87:lang_label")).click();
		 driver.findElement(By.xpath("//ul[@id='j_idt87:lang_items']/li[@data-label='Tamil']")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("j_idt87:value_label")).click();
		 //driver.findElement(By.xpath("//ul[@id='j_idt87:value_items']/li[@id='j_idt87:value_1']")).click();
		 driver.findElement(By.xpath("//ul[@id='j_idt87:value_items']/li[@data-label='இரண்டு']")).click();
		}}


