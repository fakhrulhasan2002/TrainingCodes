
public class ExceptionHandling {

	static int a =100;
	static int b =0;
	static int c;
	public static void mathod1(){
		c=a+b;
		System.out.println("Sum:"+c);
	}
	public static void mathod2(){
		try{
		c=a/b;
		//System.out.println("Div:"+c);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Finally");
			System.out.println("Div:"+c);
		}
	}
	public static void mathod3() throws InterruptedException{
		c=a*b;
		System.out.println("Mul:"+c);
		Thread.sleep(1000);
	}
	public static void mathod4(){
		System.out.println("No Operation");
	}
	
	public static void main (String arg[]) throws InterruptedException{
		mathod1();
		mathod2();
		mathod3();
		mathod4();
		
	}
	
}
