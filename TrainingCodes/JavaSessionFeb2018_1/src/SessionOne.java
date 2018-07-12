
public class SessionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello World");
        //Integer holds numerical data
        int num1 = 100;
        int num2 = 200;
        int tot = num1+num2;
        System.out.println("Total:"+tot);
        //char holds single character
        char ch1='a';
        char ch2='z';
        System.out.println("1:"+ch1+"  2:"+ch2);
        //String can hold sequence of char
        String str1 = "This is my Java Session";
        String str2 = "Add extra word";
        String str3 = str1+str2;
        System.out.println("String:"+str3);
        //float holds single precision
        float f1 = 10.9f;
        System.out.println("Float:"+f1);
        float num3=(f1+num1);
        System.out.println("Float2: "+num3);
        double d1 = 100.02;
        double d2 = (float) (d1+f1);
        System.out.println("Float3: "+d2);
	}

}
