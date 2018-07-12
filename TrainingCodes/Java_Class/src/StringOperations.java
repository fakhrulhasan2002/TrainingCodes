
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is Java/Class/in selenium batch 4";
		//find length of string
		//Trim - remove spaces
		//split the words in string
		int a=str.length();
		System.out.println(a);
		System.out.println(str);
		String s= str.trim();
		System.out.println(s);
		a=s.length();
		System.out.println(a);
		String[] sp = str.split(" ");
		for(int i=0;i<sp.length;i++){
			System.out.println(i+":"+sp[i]);
		}
		System.out.println(sp[2]);

	}

}
