package packageTwo;

public class OverrideConcept extends OverloadingConcept {

	public OverrideConcept(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public void methodOne(int z){
		int c=a+b-z;
		System.out.println("One Param-chile:"+c);
	}
	
}
