package week5.day2.classroom;

public class LearnThis {

	String cname;
	int id;
	boolean working;
	
	public LearnThis(String cname, int id, boolean working) {
		this();
		this.cname=cname;
		this.id=id;
	this. working=working;
	System.out.println(cname +" " + id + " " +working);
	
	
	}public LearnThis(){
		
		System.out.println("arguments passed");
	}
	public LearnThis(String name)
	{
		this("testleaf",1234,true);
		System.out.println("one argument passed");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
       LearnThis t=new LearnThis("testleaf");
		
	}

}
