
public class ClassC extends ClassB{

	int x;
	int y;
	int z;
	
	public static void div(int x, int y){
		int z=x/y;
		System.out.println("Result of Div:"+z);
	}
	public static void Add(int a, int b, int c){
		System.out.println("ADD function in Class C");
		int dc=a+b+c;
		System.out.println("Results of Add(in C):"+ c);
	}
	
	public static void main(String[] arg){
		div(20,2);
		Add(10,3,"dfsgsdf");
		//Mul(3,6);
	}
	
	
}
