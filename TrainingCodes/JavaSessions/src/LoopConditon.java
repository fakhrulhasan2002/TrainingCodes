
public class LoopConditon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //for(initialization;condition;increment/criteria)
		String longString="this_form_not_having_Mobile_Number_0123456789";
		int j= longString.length();
		String[] splited = longString.split("_");
		//int g= splited.length;
		System.out.println("longString: "+j);
		//System.out.println("Splitted: "+g );
		int i;
		for(i=0;i<splited.length;i++){
			System.out.println("Index"+"["+i+"]"+splited[i]);
		}
		for(String s:splited){//advanced enhanced for loop
			System.out.println(s);
		}
		
		
	}

}
