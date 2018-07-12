
public class ClassMethods {

	//Data type
	int i;
	String Str;
	boolean t=true;
	//enum e {"T", "F"};
	
	//Methods or Functions
	public  void PrintString(){
		System.out.println("Method 1");
	}
	public   void PrintInteger(int a){
		System.out.println("Method 2:"+a);
	}
	public  void AddMethod (int a, int b){ //int a and b are parameters
		int c=a+b;
		System.out.println("Method 3:"+ a + ":"+ b+"Result:"+c);
	}
	public   void MulMethod (int a, int b){ //int a and b are parameters
		int c=a*b;
		System.out.println("Method 3:"+ a + ":"+ b+"Result:"+c);
	}
	public  void ConcatMethod(int a, String Str){
		System.out.println("Method 1:"+a+":"+Str);
	}
	
}
