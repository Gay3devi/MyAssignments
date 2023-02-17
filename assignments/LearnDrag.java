package week5.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDrag {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dragme = driver.findElement(By.id("form:conpnl_header"));
		Actions build=new Actions(driver);
		build.dragAndDropBy(dragme, 100, 100).perform();
		WebElement dragsource = driver.findElement(By.id("form:drag_content"));
		WebElement dragtarget = driver.findElement(By.id("form:drop_header"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(dragsource, dragtarget).perform();
	}

}
