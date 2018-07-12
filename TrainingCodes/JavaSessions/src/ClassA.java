
public class ClassA {

	int a;
	int b;
	int c;
	
	public static void Add(){
		System.out.println("ADD function in Class A- No parameters");
		
	}
	public static void Add(int a){
		System.out.println("ADD function in Class A - One Paramter");
		//int c=a+b;
		System.out.println("Results of Add:"+ a);
	}
	public static void Add(int a, int b){
		System.out.println("ADD function in Class A- two paramters");
		int c=a+b;
		System.out.println("Results of Add:"+ c);
	}
	public static void Add(int a, int b, String c){
		System.out.println("ADD function in Class A");
		int d=a+b;
		System.out.println("Results of Add:"+ d + c);
	}
	
}
