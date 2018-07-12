
public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str="  this is my java class  ";
		int len = str.length();
		System.out.println(len);
		String str1=str.trim(); //String trim to remove blank spaces.
		System.out.println(str1.length());*/
		
		//Concatenation - adding to strings
		/*String str2="First";
		String str3="Second";
		String str4 = str2+"New"+"OLD"+str3;
		System.out.println(str4);
		String str5=str2.concat(str3.concat(str)).concat(str4);
		System.out.println(str5);*/
		
		//Split
		String source="My selenium lecture will start on 25-04-2018 and ends in May-2018";
		String[] str = source.split(" ");
		/*int i=0;
		for(String s:str){
			System.out.println("Index ["+i+"]"+s);
			i++;
		}*/
		//10-04-2018
	    System.out.println("Start Month:"+str[6].substring(3, 5));
	    System.out.println("End Month:"+str[10].substring(0, 3));
	}

}
