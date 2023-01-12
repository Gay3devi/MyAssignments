package week2.day1.assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver drive=new ChromeDriver();
	drive.get("http://leaftaps.com/opentaps/control/login");
	drive.findElement(By.id("username")).sendKeys("demosalesmanager");
	drive.findElement(By.id("password")).sendKeys("crmsfa");
	drive.findElement(By.className("decorativeSubmit")).click();
	drive.findElement(By.linkText("CRM/SFA")).click();
	drive.findElement(By.linkText("Leads")).click();
	drive.findElement(By.linkText("Create Lead")).click();
	drive.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
	drive.findElement(By.id("createLeadForm_firstName")).sendKeys("kesavan");
	drive.findElement(By.id("createLeadForm_lastName")).sendKeys("swaminathan");
	drive.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	drive.findElement(By.id("createLeadForm_description")).sendKeys("hi am kesavaraj");
	drive.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gay3devi.k@gmail.com");
	drive.findElement(By.className("smallSubmit")).click();
	System.out.println(drive.getTitle());
	drive.findElement(By.linkText("Duplicate Lead")).click();
	drive.findElement(By.id("createLeadForm_companyName")).clear();
	drive.findElement(By.id("createLeadForm_companyName")).sendKeys("Maya");
	drive.findElement(By.id("createLeadForm_firstName")).clear();
	drive.findElement(By.id("createLeadForm_firstName")).sendKeys("mouriya");
	drive.findElement(By.id("createLeadForm_lastName")).clear();
	drive.findElement(By.id("createLeadForm_lastName")).sendKeys("kesavaraj");
	drive.findElement(By.className("smallSubmit")).click();
	System.out.println(drive.getTitle());	
	drive.close();
	}

}
