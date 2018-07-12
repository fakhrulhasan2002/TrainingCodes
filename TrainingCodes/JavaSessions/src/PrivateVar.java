
public class PrivateVar {

	private static int a=10;
	private static String str="August";
	private static int b=20;
	public static int c=40;
	
	private static void privatemethod(int i, int j){
		System.out.println("This is Privte method");
		System.out.println("This is Privte var:"+i+":"+j+"+"+(i+j));
	}
	public static void publicmethod(int f, int g, String df){
		System.out.println("This is public method");
		System.out.println("This is public Var:"+f+":"+g);
		//privatemethod(f,g);
		System.out.println("This is private Var a:"+a);
		System.out.println("This is private Var b:"+b);
		System.out.println("This is private Var b:"+str);
	}
	
	public void changeVarValue(int k, int l, String s){
		a=k;
		b=l;
		str=s;
	}
}
