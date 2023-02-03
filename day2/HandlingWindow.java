package week4.day2;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindow {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.leafground.com/window.xhtml");

driver.findElement(By.id("j_idt88:new")).click();
Set<String> windowHandle = driver.getWindowHandles();
System.out.println(windowHandle);

List<String>list1=new ArrayList<String>(windowHandle);
driver.switchTo().window(list1.get(1));
String title = driver.getTitle();
System.out.println(title);
driver.close();

driver.switchTo().window(list1.get(0));

driver.findElement(By.id("j_idt88:j_idt91")).click();
Set<String> handles = driver.getWindowHandles();
System.out.println(handles);
List<String>multiplewindow=new ArrayList<String>(handles);
driver.switchTo().window(multiplewindow.get(1));
String title2 = driver.getTitle();
System.out.println(title2);
driver.close();

driver.switchTo().window(multiplewindow.get(2));
String title3 = driver.getTitle();
System.out.println(title3);
driver.close();
driver.switchTo().window(multiplewindow.get(0));

driver.findElement(By.id("j_idt88:j_idt93")).click();
Set<String> set = driver.getWindowHandles();
String title4 = driver.getTitle();
System.out.println(title4);
List<String>list=new ArrayList<String>(set);
driver.switchTo().window(list.get(3));
System.out.println(driver.getTitle());
driver.close();

driver.switchTo().window(list.get(2));
System.out.println(driver.getTitle());
driver.close();

driver.switchTo().window(list.get(1));
System.out.println(driver.getTitle());
driver.close();

driver.switchTo().window(list.get(0));
System.out.println(driver.getTitle());

driver.findElement(By.id("j_idt88:j_idt95")).click(); 
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(70));
wait.until(ExpectedConditions.numberOfWindowsToBe(2));
Set<String> windowHandles = driver.getWindowHandles();
System.out.println(windowHandles);

List<String>list2=new ArrayList<String>(windowHandles);
driver.switchTo().window(list2.get(1));
System.out.println(driver.getTitle());
driver.close();

driver.switchTo().window(list.get(0));
System.out.println(driver.getTitle());
driver.close();
driver.quit();


	}

	

}
