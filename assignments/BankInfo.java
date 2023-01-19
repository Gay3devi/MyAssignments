package week3.day2.assignments;

public class BankInfo extends AxisBank{

	public void saving() {
		System.out.println("saving is best for future");
	}
	public void fixed() {
		System.out.println("fixed deposits is best for kids");
	}
	public void deposit(int a,int b) {
		
		int c =a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {

		BankInfo info= new BankInfo();
		AxisBank bank=new AxisBank();
		
		info.saving();
		info.deposit();
		info.saving();
		info.deposit(30,10);
		
		
	}

}
