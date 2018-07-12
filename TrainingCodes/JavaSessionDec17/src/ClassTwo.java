import newclasses.ClassThree;

public class ClassTwo extends ClassOne{

	public void functionCTwo(){
		//<ClassName> Var = new <ClassName>()
		/*ClassOne var = new ClassOne();
		ClassThree var1 = new ClassThree(); //Imported from package to access protected data
		*/
		functionOne();
		functionTwo();
		functionFour();
	}
	public void functionCThree(){}
	public static void main(String[] arg){
		ClassTwo var=new ClassTwo();
		var.functionCTwo();

	}
	
}
