package week3.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.id("ext-gen248")).sendKeys("gayathri");
		driver.findElement(By.id("ext-gen334")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.linkText("10860")).click();
		String title = driver.getTitle();
		String actualtitle="View Lead | opentaps CRM";
		if(actualtitle.equalsIgnoreCase(actualtitle))
				{
			System.out.println("title matched");
			
			
			
		}else {
			System.out.println("title doesnot match");
		}
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Test1");
		driver.findElement(By.xpath(".//input[@name='submitButton']")).click();
		driver.close();
		
		
	}
		
	}
	
	


