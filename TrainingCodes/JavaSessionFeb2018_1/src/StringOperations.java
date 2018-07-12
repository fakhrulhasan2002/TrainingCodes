
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="  This is my string operation sessio in Java in March2018 ";
		int len=str.length();
		System.out.println(len);
		String str1 = str.trim();
		System.out.println(str1.length());
		String[] splitdata = str1.split(" ");
		int i=0;
		for(String s:splitdata){
		 System.out.println(i+" "+s);
		 i++;
		}
		System.out.println(splitdata[9]);
		System.out.println(splitdata[9].substring(0,5));
				
		//Concatenate
		String str3="My";
		String str4="Java";
		System.out.println("This"+str3+"&"+str4+"Class");
		String str5="is";
		String str6 =str5.concat(str3.concat(str4));
		System.out.println(str6);
		
	}

}
