package packageTwo;

public class dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingConcept oc=new OverloadingConcept(200,500);
		//oc.methodOne();
		oc.methodOne(30);
		
		//oc.methodOne(30, 40);
		OverrideConcept occ= new OverrideConcept(300,500);
		//occ.methodOne();
		occ.methodOne(30);
	}

}
