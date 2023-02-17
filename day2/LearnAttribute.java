package week5.day2;

import org.testng.annotations.Test;

public class LearnAttribute {

	@Test(priority=-2)
	public void lead() {
		System.out.println("Leads");
	}
	@Test
	public void duplicatelead() {
		System.out.println("duplicatelead");
	}
	@Test(enabled=false)
public void deletelead() {
	System.out.println("deletelead");
	}
	@Test(priority=-1)
public void mergelead() {
	System.out.println("Mergelead");
}

}


