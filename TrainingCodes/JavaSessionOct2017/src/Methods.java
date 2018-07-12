
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d=addtion(10,20);
		System.out.println(d);
		d=addtion(100,200);
		System.out.println(d);
		double e;
		e=subtraction(100,50);
		System.out.println(e);
		e=subtraction(40,30);
		System.out.println(e);
		//multiplication(10,20);

	}
	
	public static int addtion(int a, int b){
		int c=a+b;
		return c;
	}
	public static double subtraction(int a, int b){
		int c=a-b;
		System.out.println("Sub: "+c);
		return c;
	}
	public static void multiplication(int a, int b){
		int c=a*b;
		System.out.println("Mul: "+c);
	}

}
