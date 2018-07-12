
public class Puppy extends Dog{
   
	
    public static void bark(String s,int a){
    	System.out.println("Add Method(Puppy) - s:"+s);
    	System.out.println("Add Method(Puppy) - a:"+a);
    }
    public static void bark(String s,int a, int b){
    	System.out.println("Add Method(Puppy) - s:"+s);
    	System.out.println("Add Method(Puppy) - a:"+a);
    }
    private static void eat(){
    	System.out.println("Subtract Method: "+var2);
    }
public static void main(String[] args){
		Puppy py=new Puppy();
		py.var1="Soft";
		py.var2="water";
		py.bark();
		py.run();

} 
}
