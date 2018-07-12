package packageTwo;

import packageOne.CClass;
import packageOne.PackageOneClass;
import packageOne.PackageOneClassTwo;

public class PackageTwoClass {

	public void m3()
	{
		PackageOneClass pk = new PackageOneClass();
		pk.two=20;
		pk.one=3;
		
		PackageOneClassTwo pk2=new PackageOneClassTwo();
		pk2.m3();
	
	}
}
