
public class ChildInhertSession extends InhertitanceSession {
	
	/*public ChildInhertSession(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}*/

	public float TotChild;
	
	//override
	public void Addition(int abc){
		Tot = (num1+num2)/abc;
		System.out.println("Child:One Parameter:"+Tot);
	}
	/*public void Addition(float abc){
		TotChild = num1+num2+abc;
		System.out.println("Child:One Parameter:"+TotChild);
	}*/
	

}
