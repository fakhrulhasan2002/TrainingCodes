package PackageOne;

import PackageTwo.ClassOne;

public class ClassThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassOne var = new ClassOne();
		var.a=500;
		var.setA(1200);
		var.mul();
		var.sub();
		double ad=var.div();
		System.out.println(ad);
	}

}
