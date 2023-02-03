package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class TestCase3 {

	public static void main(String[] args) throws IOException {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://dev62925.service-now.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("user_name")).sendKeys("Admin");
driver.findElement(By.id("user_password")).sendKeys("GAhMak34tH-^");
driver.findElement(By.id("sysverb_login")).click();

Shadow dom=new Shadow(driver);
dom.setImplicitWait(20);
WebElement all = dom.findElementByXPath("//div[text()='All']");
all.click();

Shadow shadow=new Shadow(driver);
shadow.setImplicitWait(20);
WebElement servicecatlog = shadow.findElementByXPath("//span[text()='Service Catalog']");
servicecatlog.click();


WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
driver.switchTo().frame(frame);

driver.findElement(By.xpath("//h2[contains(text(),' Mobiles')]")).click();
driver.findElement(By.xpath("//a[@class='service_catalog']")).click();
driver.findElement(By.xpath("(//label[@class='radio-label'])[2]")).click();
WebElement selecttool = driver.findElement(By.xpath("//select[@id='IO:33494b069747011021983d1e6253af45']"));

Select drop=new Select(selecttool);
drop.selectByValue("Unlimited");
selecttool.click();

driver.findElement(By.xpath("//label[text()='Blue']")).click();


WebElement select = driver.findElement(By.xpath("(//label[@class=\"radio-label\"])[10]"));
select.click();
driver.findElement(By.id("oi_order_now_button")).click();

//Shadow root=new Shadow(driver);
//root.setImplicitWait(30);

 String text = driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
 
 System.out.println(text);
 
 
 File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
 File dest=new File("./snap/screenshot.png");
FileUtils.copyFile(screenshotAs, dest);
	}//GAhMak34tH-^//admin

}






/*Launch ServiceNow application
2. Login with valid credentials
3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
4. Click on  mobiles
5. Select Apple iPhone 13
6. Click as No in Is this a replacement for a lost or broken iPhone?
7. Select Unlimited in  Monthly data allowance
8. Choose color field as Blue and storage field as 256 GB
9. Click  Order now Button
10. Verify order is placed and get the request number"
11. Take a Snapshot
12. Close the browser*/