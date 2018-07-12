
public class StringOperation {

	static String str1="Java";
	static String str2="Class";
	static String str3="Session";
	
	public static void str(){
		str1="Java1";
		System.out.println(str1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s= str1+str2+str3;
     System.out.println(s);
     String s1=str1.concat(str2).concat(str3);
     System.out.println(s1);
     String s2="Today"+"Tomorrow"+"Yesterday ";
     System.out.println(s2);
     str();
     System.out.println(str1);
     System.out.println("1:"+s.length());
     System.out.println("2:"+s1.length());
     System.out.println("3:"+s2.length());
     
	}

}
