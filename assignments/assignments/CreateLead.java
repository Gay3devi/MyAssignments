package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("gayathri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("devi");
		
		WebElement tool=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop=new Select(tool);
		tool.click();
		
		drop.selectByVisibleText("Employee");
		WebElement tool1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop1=new Select(tool1);
		drop1.selectByValue("9001");
WebElement dropdown=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select down=new Select(dropdown);
down.selectByValue("OWN_CCORP");
WebElement dr=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select country=new Select(dr);
country.selectByValue("IND");
driver.findElement(By.className("smallSubmit")).click();
//String viewTitle=driver.getTitle();
System.out.println(driver.getTitle());
//if(viewTitle.equals(new String("View Lead | opentaps CRM"))) {
//if) {
	//System.out.println("passed");
//}else {
	//System.out.println("failed");
}
		
		
	}

	

