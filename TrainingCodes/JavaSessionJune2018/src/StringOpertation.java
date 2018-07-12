import java.util.Locale;

public class StringOpertation {

	public static void main(String[] args) {
		//concatination: +, concat()
		String str="New String"+"extra";
		String str1= "Some String";
		//System.out.println(str+" "+str1);
		String temp = str.concat(" ").concat(str1.concat("FDSGDAFG"));
		//System.out.println(temp);
		//trim
		String strtrim="   test String   ";
		System.out.println(strtrim.length());
		String s = strtrim.trim();
		System.out.println(s.length());
		System.out.println(s);
		//uppercase-lowercase conversion
		System.out.println(s.toLowerCase());
		System.out.println(s.toLowerCase());
		//split
		String strsplit="ThisismySeleniumclassinmonthofJune2018";
		String[] sd = strsplit.split("y");
		String[] se = sd[1].split("f");
		System.out.println(se[0].substring(0, 8));
		System.out.println(se[1].substring(0, 4));
		
		//System.out.println(sd.length);
		/*for(String st:sd){
		System.out.println(st);
		}*/
		//System.out.println(sd[8]+sd[9].substring(2));
		//System.out.println(sd[9].substring(2));
		//substring
		
		
	}

}
