package week5.day2.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/waits.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //click the element
        WebElement visible = driver.findElement(By.xpath("//button[@id='j_idt87:j_idt92']"));
        visible.click();
         //Explicit wait
         //Create obj for WebDriverWait
        WebElement element = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
        String findElement = driver.findElement(By.xpath("//span[text()='I am about to hide']")).getText();
        
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
         
        //wait until the element to visible
        wait.until(ExpectedConditions.invisibilityOf(element));
        //verification
        //
        System.out.println( findElement);
	}

}
