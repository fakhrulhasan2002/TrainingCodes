package newclasses;

import java.io.IOException;

public class ParentClass {

	private static int change=100;
	static int c;
	static int e1;
	static double es;
	public ParentClass(){
		es=100;
	}
	public static int add(int a, int b) {
		c = a + b;
		System.out.println("P- Add: " + c);
		return c;
	}

	public int add(int a, int b, String s) {
		c = a + b;
		System.out.println("P- Add: " + s + c);
		return c;
	}

	public int add(int a, int b, int e) {
		c = a + b + e;
		System.out.println("P- Add: " + c);
		return c;
	}

	public static int add(int a, int b, double e) {
		c = (int) (a + b + e);
		System.out.println("P- Add: Double:" + c);
		return c;
	}

	public static int sub(int a, int b) {
		c = a - b;
		System.out.println("P- Sub: " + c);
		return c;
	}

	public static int mul(int a, int b) {
		c = a * b;
		System.out.println("P- Mul: " + c);
		return c;
	}

	public static double div(int a, int b) {
		
		try{
			
		    e1 = a / b;
		    System.out.println("P- Div: " + e1);
		    //return c;
		}catch(Exception e){
			e1=2;
			e.printStackTrace();
			
		}finally{
			System.out.println("Finally");
		}
		return e1;
	}

	public static int setChange(int a){
		System.out.println("set change"+change);
		return change=a;
	}
	public static void getChange(){
		System.out.println("change"+change);
	}
	/*
	 * public static void main(String arg[]){ int a=add(10,20);
	 * System.out.println("Main - Add:"+a);
	 * 
	 * int b=sub(20,10); System.out.println("Main - Sub:"+b);
	 * 
	 * int c=mul(20,10); System.out.println("Main - Mul:"+c);
	 * 
	 * double d=div(20,10); System.out.println("Main - Div:"+d); }
	 */
}
