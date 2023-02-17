package week5.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("//a[text()='brands']"));
Actions builder=new Actions(driver);
builder.moveToElement(element).perform();


//Click L'Oreal Paris
driver.findElement(By.linkText("L'Oreal Paris")).click();


//Check the title contains L'Oreal Paris(Hint-GetTitle)
String title = driver.getTitle();
	System.out.println("the Title :" + title);
	
// Click sort By and 
driver.findElement(By.xpath("//span[@class='sort-name']")).click();

//select customer top rated	
driver.findElement(By.xpath("//span[text()='customer top rated']")).click();

//6) Click Category and click Hair->Click haircare->Shampoo


 driver.findElement(By.xpath("//span[text()='Category']")).click();
 Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Hair']")).click();
driver.findElement(By.xpath("(//span[@class='filter-name '])[1]")).click();
driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();

//click->concern->colorprotection
driver.findElement(By.xpath("//span[text()='Concern']")).click();
driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
driver.findElement(By.xpath("//div[contains(text(),'Oreal Paris Colour Protect Shampoo')]")).click();
// check the filter is applied
String text = driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
System.out.println(text);

//
Set<String> windowHandles = driver.getWindowHandles();
System.out.println(windowHandles);
List<String>list=new ArrayList<String>(windowHandles);
driver.switchTo().window(list.get(1));

WebElement selectsize = driver.findElement(By.xpath("//select[@title=\"SIZE\"]"));
selectsize.click();
Select dropdown=new Select(selectsize);
dropdown.selectByVisibleText("180ml");



String text2 = driver.findElement(By.xpath("(//div[@class='css-1d0jf8e'])[1]")).getText();
System.out.println("MRP of the product:"+ text2);

driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();

driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']//button")).click();


WebElement frame = driver.findElement(By.xpath("//iframe[@src=\"/mobileCartIframe?ptype=customIframeCart\"]"));
driver.switchTo().frame(frame);


String text3 = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
 
System.out.println(text3);

driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();

Set<String> windowHandles2 = driver.getWindowHandles();
System.out.println(windowHandles2);

List<String>list1=new ArrayList<String>(windowHandles2);
driver.switchTo().window(list1.get(1));

driver.findElement(By.xpath("(//button[@class=\"css-110s749 e8tshxd1\"])[2]")).click();

driver.findElement(By.xpath("(//img[@alt='Image'])[7]")).click();


driver.findElement(By.xpath("//p[text()='Price Details']")).click();
String text4 = driver.findElement(By.xpath("(//div[@class='css-vlqrtx e1d9ugpt3'])[3]")).getText();
System.out.println(text4);
System.out.println(text3);

if(text3.equals(text4)) {
	System.out.println("sameprice");
}else {
	System.out.println("price is not same");
	
	
	}
driver.quit();
}

}
