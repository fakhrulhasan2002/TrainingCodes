import One.ClassTwo;

public class ClassP {
	public static int a;
	protected static int b=20;
	private static int c=30;
	static int total;
	
	public ClassP(){
		this.a=100;
	}
	static void func(){
		System.out.println("Func");
	}
	public static void functionOne(){
		total=a+b;
		System.out.println("Total One:"+total);
	}
	public static void functionOne(int i){
		total=a+b+i;
		System.out.println("Total One:"+total);
	}
	public static void functionOne(int i, int j){
		total=a+b+i+j;
		System.out.println("Total One:"+total);
	}
	public static void functionOne(int i, String str){
		total=a+b;
		System.out.println("Total One:"+total+":"+str);
	}
	public static void functionOne(int i, int j,String str){
		total=a+b+i+j;
		System.out.println("Total One:"+total+":"+str);
	}
	private void functionTwo(){
		total=b+c;
		System.out.println("Total Two:"+total);
		
	}
	protected static void functionThree(){
		total=b+c;
		System.out.println("Total Two:"+total);
		
	}
}
