
public class SessionOne {

	static int a;
	static String str;
	static double d;
	static char c;
	static float f;
	static long l;
	static byte b;
	static boolean bl;
	public SessionOne(){
		a=1;
		str="bb$%$^#&2	33241234";
		d=10.9;
		c='f';
		f=90.9f;
		l=2346456l;
		b=5;
		bl=true;
	}
	public static void main(String[] arg){
		SessionOne st=new SessionOne();
		System.out.println("Int:"+a);
		System.out.println("String:"+str);
		System.out.println("double:"+d);
		System.out.println("char:"+c);
		System.out.println("float:"+f);
		System.out.println("long:"+l);
		System.out.println("byte:"+b);
		System.out.println("bool:"+bl);
		a=(int) f;
		System.out.println("int:"+a);
		
	}
}
