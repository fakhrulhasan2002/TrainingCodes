package newclasses;

public class ChildClass extends ParentClass {

	
	public static int add(int a, int b) {
		c = 4 * (a + b);
		System.out.println("C- Add: " + c);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ParentClass var= new ParentClass();
		int a = add(10, 20);
		System.out.println("Main - Add:" + a);

		double d = div(20, 0);
		System.out.println("Main - Div:" + d);
		
		double f=d+es;
		System.out.println("f: "+f);
		int b = sub(20, 10);
		System.out.println("Main - Sub:" + b);

		int c = mul(20, 10);
		System.out.println("Main - Mul:" + c);

		getChange();
		int g= setChange(200);
		System.out.println(g);
		getChange();
	}

}
