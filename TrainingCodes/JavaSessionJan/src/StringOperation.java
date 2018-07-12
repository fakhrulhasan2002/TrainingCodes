
public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="  This is my first Selenium Class on 13 January 2018  ";
		String str1="Java";
		String str2="Selenium";
		String str3="Class";
		
		//Concatination
		//String str4=str1+" "+str2+" "+str3;
		String str4=str1.concat(" ").concat(str2).concat(" ").concat(str3).concat("Additiona").concat("String");
		System.out.println(str4);
		System.out.println("One"+"Five"+"Automation"+"Lecture"+"Today");
		String str5 = str1+"My Computer";
		System.out.println(str5);
		//equals
		boolean res = str1.equals(str2);
		System.out.println(res);
		
		//Trim
		System.out.println("Before Trim"+str.length());
		String str6 = str.trim();
		System.out.println("After Trim"+str6.length());
		
		//split
		String[] strArr = str6.split("January");
		int i=0;
		for(String s:strArr){
			System.out.println(i+":"+s);
		    i++;
		}
		
		//System.out.println(strArr[9]);
		
		//substring
		String arr = strArr[1].substring(3,4);
		System.out.println(arr);

		
	}

}
