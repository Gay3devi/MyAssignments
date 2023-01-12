package week2.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account"	)).click();
		driver.findElement(By.className("inputBox")).sendKeys("DebitLimitedAccount");
		driver.findElement(By.name("description")).sendKeys("SeleniumAutomationTester");
		driver.findElement(By.id("groupNameLocal")).sendKeys("Localname");
		driver.findElement(By.id("officeSiteName")).sendKeys("SiteName");
		driver.findElement(By.id("annualRevenue")).sendKeys("454545");
		
		WebElement tool=driver.findElement(By.name("industryEnumId"));
		Select drop=new Select(tool);
		drop.selectByValue("IND_SOFTWARE");
		
		WebElement tools= driver.findElement(By.name("ownershipEnumId"));
		Select drop1=new Select(tools);
		drop1.selectByVisibleText("S-Corporation");
		
		WebElement source= driver.findElement(By.id("dataSourceId"));
		Select emp=new Select(source);
		emp.selectByValue("LEAD_EMPLOYEE");
		//select market campagin
		
		WebElement marketCampagin=driver.findElement(By.id("marketingCampaignId"));
		Select list=new Select(marketCampagin);
		list.selectByIndex(6);
		
		WebElement State=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select texas=new Select(State);
		texas.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		
		
	}

}
