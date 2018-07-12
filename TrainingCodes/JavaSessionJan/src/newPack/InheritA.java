package newPack;

public class InheritA {
	
	static int i;
	static int j;
	//constructor
	public InheritA(int a, int b){
		this.i=a;
		this.j=b;
	}
	//overloading
	public static void add(){
		System.out.println("No Parameter"+i+","+j);
	}
	public static void add(int a){
		int c=a+10;
		System.out.println("One Parameter:"+c);
	}
	
	public static void add(int a, int b){
		int c=a+b;
		System.out.println("Two Parameter:"+c);
	}
	public static void add(int a, int b, String c){
		int e=a+b;
		System.out.println("Three Parameter:"+e+":"+c);
	}
	public static void add(int a, int b, char c, String d){
		int e=a+b;
		System.out.println("Four Parameter:"+e+":"+c+":"+d);
	}
	public static void sub(int a, int b){
        int c= a-b;
        System.out.println("Sub-P:"+c);
	}
	
	public static void main(String sr[]){
		//InheritA aa=new InheritA();
		add();
	}

}
