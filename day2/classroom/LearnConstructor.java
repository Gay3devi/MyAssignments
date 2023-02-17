package week5.day2.classroom;

public class LearnConstructor {
	//constructor default
	//no return value method name is same as class name
	public LearnConstructor() {
		System.out.println("constructor 1");// if we didnt intialize the constructor this block wont work
	}static {
		System.out.println("staticblock");
	}

	public static void main(String[] args) {
		
		System.out.println("mainmethod");
LearnConstructor construct=new LearnConstructor();
System.out.println("after creation object");
	}

}
