
public class Methods {

	static int a;
	static int b;
	String str;
	
	public Methods(int cc, int bb){
		this.a=cc;
		this.b=bb;
	}
	

	public static void methodsOne(){
		int c;
		c=a+b;
		System.out.println("Value-1:"+c);
	}
	public static int methodTwo(int d){
		int c;
		c=a+b+d;
		System.out.println("Value-2:"+c);
		return c;
	}
	public static void methodThree(int e, int f, String s){
		int c;
		c=e+b+f;
		System.out.println(s+":"+c);
	}
	
	/*public static void main(String[] arg){
		Methods m=new Methods();
		m.a=100;
		m.b=200;
		m.methodsOne();
		m.methodThree(5, 9, "String");
		int abc = m.methodTwo(20);
		System.out.println("Returned value:"+abc);
		a=100;
		b=200;
		methodsOne();
		methodThree(5, 9, "String");
		int abc = methodTwo(20);
		System.out.println("Returned value:"+abc);
	}*/

}
