
public class SessionOne {


	//Data, attribute or properties\
	//Global Variable
	static int varone = 200;
	static int var = 300;
	String vartwo = "sdfgdf";
	char varthree = 'g';
	double varfour = 100.02;
	long varfive = (long) 100.00001;
	
	//Methods, Funtions or behviour
	
	public static void function(){
		//Local varibale c
		int c =  varone + var;
		System.out.println("Sum-func 1-"+ c);
	} 
	
	public static void functiontwo(int d){
		int c=varone+var+d;
		System.out.println("Sum-func 2-"+ c);
	
	}
	public static void functionthree(int d, String s){
		int c=varone+var+d;
		System.out.println("Sum-func 3-"+s+" - "+c);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.print("Hello");
		System.out.println("Hello world");
		System.out.print("Hello");*/
		function();
		functiontwo(100);
		functionthree(50,"sdfsdf");
		
	}

}

