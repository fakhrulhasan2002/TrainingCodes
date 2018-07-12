
public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1="String One";
		String Str2="String Two";
		String Str3="Add Some thing"+Str1+Str2;
		String[] Sarr={"thishis isis","2345234","&%^$#&"};
		int[] intarr={23,345,56,678};
		System.out.println(Str1.concat(Str2).concat(Str3));
		//System.out.println(Str3);
		
		
		//split
		String longString="this_form_not_having_Mobile_Number_0123456789";
		String[] splited = longString.split("_");
		System.out.println(splited[1]);
		int len = longString.length();
		System.out.println(len);
		
	}

}
