package oopsPackageTwo;

import OopsPackage.ClassSession;
import OopsPackage.ClassTwo;

public class ClassThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassSession cs = new ClassSession();
		ClassTwo ct = new ClassTwo();
		ct.setG(5000);
	
		int r = ct.getG();
		System.out.println(r);
		
	}

}
