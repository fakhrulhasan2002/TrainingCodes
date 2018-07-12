package One;

public class ClassOne {

	public static int a=10;
	protected static int b=20;
	private static int c=30;
	static int total;
	
	void func(){}
	public void functionOne(){
		total=a+b;
		System.out.println("Total One:"+total);
		ClassTwo clT=new ClassTwo();
		clT.functionOneC();
	}
	private void functionTwo(){
		total=b+c;
		System.out.println("Total Two:"+total);
		
	}
	protected void functionThree(){
		total=b+c;
		System.out.println("Total Two:"+total);
		
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		functionOne();
		functionTwo();
		//Reference Data type
		ClassOne cl=new ClassOne();
		cl.functionOne();
		cl.functionTwo();
		
	}*/

}
