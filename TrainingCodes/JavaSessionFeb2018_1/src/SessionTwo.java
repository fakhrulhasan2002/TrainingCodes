
public class SessionTwo {

	public static void functionOne(){
		System.out.println("Function One");
	}
    public static void functionTwo(String str){
    	System.out.println("Custom Message: "+str);
	}
    public static void functionThree(String str, int i, int b, double d){
	  System.out.println("Multiple Params:"+str);
	  System.out.println("Int i:"+i);
	  System.out.println("Int b:"+b);
	  System.out.println("Double:"+d);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionOne();
		functionTwo("This is custom message");
		functionThree("Message", 100, 200, 300.5);
	}

}
