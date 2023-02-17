package week5.day1.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTheCountOfRowsandColumns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//counts of rows
		List<WebElement> rowcounts = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		int size = rowcounts.size();
		System.out.println("number of rows count"+ " "+size);
		
		//counts of columns
		List<WebElement> columncounts = driver.findElements(By.xpath("//table[@class='attributes-list']//tr/th"));
		int size2 = columncounts.size();
		System.out.println("number of columns count"+ " "+ size2);
	}

}
