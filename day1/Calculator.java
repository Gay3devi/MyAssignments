package week1.day1;

public class Calculator {

	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a,int b, int c) {
		return a+b+c;
	}
	public int sub(int a, int b){
	
			return(a-b);
			
	}public double sub(double a, double b) {
		return a-b;
	}
	
	public int multiply(int a,int b) {
		return a*b;
		
	}public double multiply(int a, double b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}public double div(int a,double b) {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator c1=new Calculator();
int addtotal=c1.add(10,20);
int addtot=c1.add(20,30,40);
int subtot=c1.sub(100,60);
double subTotal=c1.sub(89.78,67.34);
int mulTotal=c1.multiply(10,100);
double multot=c1.multiply(19,11.5);
int divtot=c1.div(35,5);
double divTotal=c1.div(567,55.6);

System.out.println(addtotal);
System.out.println(addtot);
System.out.println(subtot);
System.out.println(subTotal);
System.out.println(mulTotal);
System.out.println(multot);
System.out.println(divtot);
System.out.println(divTotal);

	}

}
