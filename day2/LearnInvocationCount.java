package week5.day2;

import org.testng.annotations.Test;

public class LearnInvocationCount {

	@Test(invocationCount=2)
	public void student() {
		System.out.println("Student name: Raju");

	}
	@Test(invocationCount=3, invocationTimeOut=2000, threadPoolSize=3)
public void school() {

	System.out.println("ABC SCHOOL");
}
@Test
public void section() {
	System.out.println("A section");
	
}
}

