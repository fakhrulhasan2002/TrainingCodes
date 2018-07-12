package calculator;

public class CalculatorSci extends Calculator{
	
	/*public static void calc(){
	addition(20,30);
	}*/
	double c;
	double j=10;
	//overriding 
	public void addition(double a,double b){
		c= a+b;
		System.out.println("Chile-Addition:"+c);	
	}
	public void cos(double a){
	    double x = Math.cos(a);
	    System.out.println("COS:"+x);
	}
	public void sin(double a){
	    double x = Math.sin(a);
	    System.out.println("SIN:"+x);
	}
	public void tan(double a){
	    double x = Math.tan(a);
	    System.out.println("TAN:"+x);
	}
	
	public static void main(String[] arg){
		//calc();
		CalculatorSci cal=new CalculatorSci();
		cal.y=10;
		cal.c=200;
		cal.addition(10, 20);//parent 
		cal.division(30, 5); // parent
		cal.multiplication(50, 40);//parent
		cal.cos(10.7);
		cal.sin(20.8);
		cal.tan(30.7);
		//Calculator pcal= new Calculator();
		
	} 
}
