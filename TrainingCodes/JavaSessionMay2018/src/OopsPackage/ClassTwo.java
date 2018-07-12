package OopsPackage;

public class ClassTwo {
	
	public static int z;
	private static int g;
	public static int getG() {
		return g;
	}

	public static void setG(int g) {
		ClassTwo.g = g;
	}

	
	public void functionOneCTwo(){
		//<ClassName> <Ref Var> = new <ClassName>();
		System.out.println("g:"+g);
	}
	
	public static void main(String[] arg){
		ClassSession cs =new ClassSession();
		cs.functionFour(10, 'a');
		double ret = cs.functionOne();
		System.out.println(ret);
		cs.functionThree();
		cs.ch='d';
		cs.str="ClassTwo";
		cs.i=1000;
		cs.functionFour(500, 'p');
		ret = cs.functionOne();
		System.out.println(ret);
		cs.functionThree();
		
		
		
	}

}
