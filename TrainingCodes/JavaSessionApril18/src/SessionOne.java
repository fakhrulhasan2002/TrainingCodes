
public class SessionOne {
	
	static public int a=10;
	static private int b=20;
	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		SessionOne.b = b;
	}

	static private String str="Class String";
	static public char ch='c';
	static double d=9.9;
	static int total=0;
	
	public void methodOne(){
	    	total = a+b;
	    	System.out.println(total);
	}
	
	public void methodOneA(int x, int y, String s){
		total = x+y;
		System.out.println(s+":"+total);
	}
	public static int methodTwo(){
		return a+b;
	}

    public static String methodThree(){
		return str;
	}
    
    public double methodFour(){
		return d;
	}
    
    /*public static void main(String[] arg){
    	methodOne();
    	int sum = methodTwo();
    	System.out.println("Return:"+sum);
    	System.out.println(methodThree());
    }*/
    
}
