package packageOne;

public class PackageOneClassTwo {

	private void m1(){
		PackageOneClass pk= new PackageOneClass();
		pk.four=10;//protected
		pk.one=20;
		pk.three=40;
		pk.two=56;
		pk.one=10;
		pk.m4();
		
	}
	protected void m2(){
		PackageOneClass.one=10;
	}
	public void m3(){
		PackageOneClass.one=10;
	}

}
