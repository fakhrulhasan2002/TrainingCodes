package com.Inherit;

public class CaseTwo extends CaseOne{

	public static void sum(){
		total=abc+xyz+(percent());
		System.out.println("Child:"+total);
	}
	public static int percent(){
		System.out.println((int) (xyz*100/(abc+xyz)));
		return((int) (xyz*100/(abc+xyz)));
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub

		abc=500;
		
		sum(50);
		div();
		myName("Child");
	    mul();
	}

}
