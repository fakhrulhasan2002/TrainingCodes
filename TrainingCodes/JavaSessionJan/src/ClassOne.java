
public class ClassOne {

	static int a=10;
	public static int b=20;
	protected static int c=30;
	private static int x=200;
	
	public static void add(){
		int f=a+b+x;
		System.out.println("Sum:"+c);
	}
	public static void sub(){
		int g=x+c-b;
		System.out.println("Sub:"+g);
	}
	private static void padd(){
		int g=x+c-b;
		System.out.println("Sub:"+g);
	}
	private static void psub(){
		int g=x+c-b;
		System.out.println("Sub:"+g);
	}
			
	public static void main(String arg[]){
		add();
		sub();
	}
	
}
