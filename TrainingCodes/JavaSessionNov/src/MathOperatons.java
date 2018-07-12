
public class MathOperatons {

	//int a;
	//int b;
	
	public static void add(int a, int b){
		int c=a+b;
		System.out.println("Addition:"+c);
	}
	public static void sub(int a, int b){
		int c = a-b;	
		System.out.println("Sub:"+c);
	}
	public static void mul(int a, int d){
		int c = a*d;
		System.out.println("Mul:"+c);
	}
	public static void div(int a, int f){
		try{
			int c=a/f;
			System.out.println("Div:"+c);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		div(100,0);
		add(10,20);
		sub(20,10);
		mul(10,30);
		
	}

}
