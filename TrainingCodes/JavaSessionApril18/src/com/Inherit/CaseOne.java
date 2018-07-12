package com.Inherit;

public class CaseOne {

	public static int abc= 90;
	protected static int xyz=120;
	protected int st=600;
	public static String str="Name";
	static int total = 0;
	
	public static void sum(){
		total=abc+xyz;
		System.out.println(total);
	}
	public static void sum(int i){
		total=abc+xyz+i;
		System.out.println(total);
	}
	public static void sum(int i, String s){
		total=abc+xyz+i;
		System.out.println(s+":"+total);
	}
	public static void sum(int i, int j, String s){
		total=abc+xyz+i+j;
		System.out.println(s+":"+total);
	}
	public static void myName(String str2){
		System.out.println(str+":"+str2);
	}

	private void sub(){
		total=abc-xyz;
		System.out.println(total);
	}
	protected static void mul(){
		total=abc*xyz;
		System.out.println(total);
	}
	
	public static int div(){
		try{
		    total=abc/0;
		}catch(Exception e){
			e.printStackTrace();
			total = 1;		}
		   
		return total;
	}
}
