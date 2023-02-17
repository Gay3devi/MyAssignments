package week5.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintSecurityNames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals'][1]")).click();
		List<WebElement> securitynames = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//td[1]"));		
		int size = securitynames.size();
	//int size2 = securitynames.size();
	System.out.println(size);
	for(WebElement e:securitynames) {
		System.out.println(e.getText());
	}
		//ensure the duplicate names
	}}
		
		