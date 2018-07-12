
public class FunctionDef {

	int a=10;
	int b=200;
	String str ="Test";
    
	public static void add(int a, int b){
		int c= a+b;
		System.out.println("Add:"+c);
	}
	private static void sub(int a, int d){
		int s=a-d;
		System.out.println("Sub:"+s);
	}
	public static void mul(int x, int y, String str1){
		int g=x*y;
		System.out.println(str1+":"+g);
		
	}
	public static void div(int m, int n, String str1){
		int h=m/n;
		System.out.println(str1+":"+h);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       add(100,200);
       sub(300,200);
       mul(20,50,"Multiplication");
       div(10,5,"Division");
       
	}

}
