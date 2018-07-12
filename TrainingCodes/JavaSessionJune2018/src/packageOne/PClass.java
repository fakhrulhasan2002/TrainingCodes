package packageOne;

public class PClass extends GClass{

	public int pa;
	private int pb;
	protected String pstr;
	public  char pc;
	
	public void pm1(){
		gm1();
		System.out.println("Parent:"+pa);
	}
	private void pm2(){
		
		System.out.println("Parent:"+pb);
	}
	protected void pm3(){
		gm3();
		System.out.println("Parent:"+pstr);
	}
	public void pm4(){
		gm4();
		System.out.println("Parent:"+pc);
	}
	
	
	
}
