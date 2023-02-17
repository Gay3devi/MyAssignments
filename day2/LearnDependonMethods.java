package week5.day2;

import org.testng.annotations.Test;

public class LearnDependonMethods {


@Test
public void lead()  {
	
throw new RuntimeException();
//System.out.println("Leads");
}
@Test(dependsOnMethods= {"lead"})
public void duplicatelead() {
	System.out.println("duplicatelead");
	
}
@Test(dependsOnMethods= "lead", alwaysRun=true)
public void deletelead() {
System.out.println("deletelead");
}
@Test
public void mergelead() {
System.out.println("Mergelead");
}}