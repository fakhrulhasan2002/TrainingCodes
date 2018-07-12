package NewPack;
import calculator.Calculator;

public class TestClass {

	public static void main(String[] arg){
	/*Calculator calc=new Calculator();
	calc.addition(20, 15);*/
	String str="This is my second class";
	SplitString spl=new SplitString(20,20.5,'h',"Test");
	spl.splitStr(str);
	SplitString spl1=new SplitString(26,22.5,'i',"Test1");
	spl1.splitStr(str);
	
	}
	
}
