package packageTwo;

public class OverloadingConcept {

	public final int a;
	public int b;
	
	public OverloadingConcept(int x, int y){
		this.a=x;
		this.b=y;
	}
	
	public void methodOne(){
		int c=a+b;
		System.out.println("No Param:"+c);
	}
	public void methodOne(int z){
		int c=a+b+z;
		System.out.println("One Param:"+c);
	}
	public void methodOne(int z, int q){
		int c=a+b+z+q;
		System.out.println("Two Param:"+c);
	}
}
