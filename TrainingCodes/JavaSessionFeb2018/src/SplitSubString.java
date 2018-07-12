
public class SplitSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ThisismyJavaSessiononFebruary112018";
		System.out.println(str.length());
		
		//split
		String[] var = str.split("on");
		for(int i=0;i<var.length;i++)
		  System.out.println("["+i+"]"+var[i]);
		
		//System.out.println(var[6]+":"+var[7]+":"+var[8]);
		
		//SubStrings
		//System.out.println(var[6].substring(0, 3));
		//System.out.println(var[6].substring(0,3)+":"+var[7]+":"+var[8]);
	    System.out.println(var[2].substring(0, 8));
	    System.out.println(var[2].substring(0, 8).substring(0, 3));
	    System.out.println(var[2].substring(8, 10));
	    System.out.println(var[2].substring(10, 14));
	}
	

}
