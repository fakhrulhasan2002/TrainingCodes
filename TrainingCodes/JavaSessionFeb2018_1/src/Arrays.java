
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str1={"This","is","My","Jave","Class"};
		String[] str= new String[10];
		str[0]="This";
		str[1]="is";
		str[2]= "my";
		str[3]="java";
		str[4]="class";
		str[9]="End";
		//str[5]="March";
		//for(int i=0;i<str.length;i++)
		System.out.println(str.length);
		for(String s:str)
		 System.out.println(s);

	}

}
