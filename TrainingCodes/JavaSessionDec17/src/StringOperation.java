
public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find length
		//trim -> remove spaces
		//split --> access specific word
		//substring
		//contactination
		
		/*String str = "  This is my selenium class in december 2017  ";
	    int a = str.length();
	    System.out.println("Length - "+a);
	    String str1=str.trim();
	    int b = str1.length();
	    System.out.println("Length - (after trim) "+b);
	    
	    String str2=str1.substring(8, 20);
	    System.out.println("substring-"+str2);
	    
	    System.out.println("substring-UC "+str2.toUpperCase());
	    System.out.println("substring-LC "+str2.toLowerCase());*/
		
		//Concatenation
		/*String str1 = "Flight";
		String str2 = "Reservation";
		
		String str3 = str1+str2;
		String str4 = "My" + "Laptop"+'a';
		String str5 = str1+" "+" My "+"Mobile";
		String str6 = str1.concat(str2).concat(str3).concat(str4).concat(str5);
		System.out.println(str1+'['+"dahvkjdfv"+"]"+str6);*/
		
		
		String str = "  This is my%selen%ium cla%ss in %december% 2017  ";
		String str1=str.trim();
		String[] sp = str1.split("%");
		int a = sp.length;
		System.out.println(a); //0-7 indexes
		int i=0;
		for(String s:sp){
			System.out.println(i+"="+s);
			i++;
		}
		System.out.println(sp[4]);
	}

}
