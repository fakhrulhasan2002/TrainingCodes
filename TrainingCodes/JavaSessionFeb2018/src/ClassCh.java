
public class ClassCh {
	
	
	static void func(){
		System.out.println("Func in Child");
	}
	/*public static void functionOne(){
		total=a/b;
		System.out.println("Total One in Child:"+total);
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassP p=new ClassP();
		//a=100;
		//b=300;
		func();
		p.functionOne();
		//functionTwo();
		//functionThree();

	}

}
