package newPack;

public class InhetitB {//extends InheritA{


	//overriding
	/*public static void sub(int a, int b){
		int d=(a-b)*10;
		System.out.println("Ch:"+d);
	}*/
	public static void main(String arg[]){
		/*add(10);
		sub(10,20);*/
		InheritA bb=new InheritA(10,60);
		bb.add();
		
		InheritA bbb=new InheritA(20,80);
		bbb.add();
		
		InheritA bbc=new InheritA(1000,90);
		bbc.add();
	}
}
