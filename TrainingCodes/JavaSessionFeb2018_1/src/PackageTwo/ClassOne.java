package PackageTwo;

public class ClassOne {

	 //attributes or properties
	public static int a=100;
	private static int b=20;
	static private int c;
	static protected int d=100;
	public static String str="Message";
	
	//methods or functions or behaviors 
	private static void add(){
		c=a+b;
		System.out.println(str+":Additon Result:"+c);
	}
	
	public static void sub(){
		c=a-b;
		System.out.println(str+":Substraction Result:"+c);
	}
	public static void mul(){
		c=a*b;
		System.out.println(str+":Multiplication Result:"+c);
	}
	public static double div(){
		c=a/b;
		System.out.println(str+":Division Result:"+c);
		return c;
	}

	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		ClassOne.a = a;
	}
	
	
	
	/*public static void main(String[] args){
		add();
		sub();
	}*/

}
