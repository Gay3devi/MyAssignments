package week5.day1.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDynamicTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> table = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr//td[2]"));
		int size = table.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			System.out.println(table.get(i).getText());
		}
		
		//rowsize
		List<WebElement> rowsize = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr"));
		int size2 = rowsize.size();
		System.out.println(size2);
		
		//columnsize
		List<WebElement> columnsize = driver.findElements(By.xpath("(//table[@role='grid'])[2]//th/td"));
		int size3 = rowsize.size();
		System.out.println(size3);
		
		
		for(int i=0;i<size2;i++){
				
		List<WebElement> data = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr["+ i+1 +"]/td[1]"));
		System.out.println(data.get(i).getText());
		

	
		}}}
