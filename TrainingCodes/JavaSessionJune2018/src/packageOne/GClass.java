package packageOne;

public class GClass {

	public int ga;
	private int gb;
	protected String gstr;
	public  char gc;
	
	public void gm1(){
		System.out.println("Grand:"+ga);
	}
	private void gm2(){
		System.out.println("Grand:"+gb);
	}
	protected void gm3(){
		System.out.println("Grand:"+gstr);
	}
	public void gm4(){
		System.out.println("Grand:"+gc);
	}
}
