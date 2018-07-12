
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str = "  ThisisastoryofboywholivedinToronto  ";
           System.out.println(str);
           int a = str.length();
           System.out.println(a);
           String str1=str.trim();
           System.out.println("\n");
           System.out.println(str1);
           int b=str1.length();
           System.out.println(b);
           String[] str3 = str1.split("f");
           System.out.println(str3[0]);
           System.out.println(str3[1]);
           String[] str4=str3[1].split("w");
           System.out.println(str4[0]);
           System.out.println(str4[1]);
           
           
	}

}
