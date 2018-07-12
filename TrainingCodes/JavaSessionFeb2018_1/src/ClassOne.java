
public class ClassOne {

	 //attributes or properties
	static int a=100;
	static int b=20;
	static private int c;
	static protected int d=100;
	static String str="Message";
	
	//methods or functions or behaviors 
	private static void add(){
		c=a+b;
		System.out.println(str+":Additon Result:"+c);
	}
	
	static void sub(){
		c=a-b;
		System.out.println(str+":Substraction Result:"+c);
	}
	static void mul(){
		c=a*b;
		System.out.println(str+":Multiplication Result:"+c);
	}
	static void div(){
		c=a/b;
		System.out.println(str+":Division Result:"+c);
	}
	
	/*public static void main(String[] args){
		add();
		sub();
	}*/

}
