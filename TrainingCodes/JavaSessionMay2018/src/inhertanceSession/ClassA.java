package inhertanceSession;

public class ClassA {
    public static int a=100;
	public static int b;
	private static String s;
	protected static String s1;
	
   public static void add(){
		
		//a=i+j;
		System.out.println("Add result:No Param");
		
	}
   public static void add(int i){
		
		a=i;
		System.out.println("Add result:One Param"+a);
		
	}
	public static void add(int i, int j){
		
		a=i+j;
		System.out.println("Add result:Two Pram"+a);
		
	}
public static void add(int i, int j, int k){
		
		a=i+j+k;
		System.out.println("Add result: three Param"+a);
		
	}
	
	public static void sub(int i, int j){
		
		b=i-j;
		System.out.println("Sub result:"+b);
		
	}
	private void percent(int i, int j){
		
		b=i/(i+j)*100;
		System.out.println("Percent result:"+b);
		
	}
}
