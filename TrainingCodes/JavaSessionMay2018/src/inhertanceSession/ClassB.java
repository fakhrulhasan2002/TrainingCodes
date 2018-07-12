package inhertanceSession;

public class ClassB extends ClassA{

	public static int c;
	public static int d;
	private static String s2;
	protected static String s3;
	
	/*public static void add(int i, int j){
		
		a=i+j+10;
		System.out.println("Add[C] result:"+a);
		
	}*/
	public static void mul(int i, int j){
		
		c=i*j;
		System.out.println("Mul result:"+c);
		
	}
	
	public static void div(int i, int j){
		
		d=i/j;
		System.out.println("div result:"+d);
		
	}
	private void mod(int i, int j){
		
		d=i%j;
		System.out.println("Mod result:"+d);
		
	}
	public static void main(String[] arg){
		a=100;
		b=400;
		//mul(10,20);
		//div(30,5);
		//ClassA ca=new ClassA();
		add(a,b,20);
		//sub(40,20);
	}
}
