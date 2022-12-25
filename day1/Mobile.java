package week1.day1;

public class Mobile {

	public void makeCall() {
		String mobileModel="redminote";
		float mobileWeight=10.2f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost=10000;
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile();
		m1.makeCall();
		m1.sendMsg();
		System.out.println("this is my mobile");
	}

}
