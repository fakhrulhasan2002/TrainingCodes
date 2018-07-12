
public class Dog {

	//default is public
    static String var1;
    public static String var2;
    private static int var3;
    
    public static void bark(){
    	System.out.println("Add Method:"+var1);
    }
    public static void bark(String s){
    	System.out.println("Add Method:"+s);
    }
    public static void bark(String s,int a){
    	System.out.println("Add Method - :"+s);
    	System.out.println("Add Method - a:"+a);
    }
    private static void eat(){
    	System.out.println("Subtract Method: "+var2);
    }
    public static int run(){
    	int c=10;
    	System.out.println("Multi: "+ var3);
		return c;
		}
   
    
}
