
public class ClassTwo {

	int ac=20;
	private int bc=40;
	int cc=60;
	private int totalc; 
	
	public void functionOneC(){
		totalc=ac+bc;
		System.out.println("Total One C:"+totalc);
	}
	
	private void functionTwoC(){
		totalc=ac+cc;
		System.out.println("Total One C:"+totalc);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassOne cl=new ClassOne();
		cl.functionOne();
		cl.a=100;
		cl.b=400;
		cl.functionOne();
		
	}

}
