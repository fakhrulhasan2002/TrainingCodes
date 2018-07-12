package packageOne;

public class CClass extends PClass{
	public int ca;
	private int cb;
	protected String cstr;
	public  char cc;
	
	public void cm1(){
		System.out.println("Child:"+ca);
	}
	private void cm2(){
		System.out.println("Child:"+cb);
	}
	protected void cm3(){
		System.out.println("Child:"+cstr);
	}
	public void cm4(){
		System.out.println("Child:"+cc);
		}
	
	
}
