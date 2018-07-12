
public class ClassB {

	ClassA cla= new ClassA();
	
	public void function1B(){
	cla.b=500;
	System.out.println(cla.b);
	cla.function4();
	cla.funtion3(6);
	cla.function4();
	
	}
	 
	public static void main(String[] arg){
		
		ClassB clb = new ClassB();
		clb.function1B();
	}
}
