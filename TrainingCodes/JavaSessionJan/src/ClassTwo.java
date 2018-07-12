
public class ClassTwo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//<ClassName> Refvar = new <ClassName>();
		//ClassOne obj=new ClassOne();
		ClassOne.a=50;
		ClassOne.b=100;
		ClassOne.c=500;
		ClassOne.add();
		ClassOne.sub();
		
		ClassOne obj1 = new ClassOne();
		obj1.a=5000;
		obj1.b=1000;
		obj1.c=50000;
		obj1.add();
		obj1.sub();
	}

}
