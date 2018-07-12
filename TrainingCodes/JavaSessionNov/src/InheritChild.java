
public class InheritChild extends InheritParent{

	public void add(int a, int b, String s){
		int c = a+b+10;
		System.out.println("C: 3 (2 in +1) s) - sig:"+s+":"+c);
	}
	
	public void sub(int a, int b){
		int c = a-b;
		System.out.println("C: 2 sig:" +c);
	}
	public void sub(int a, int b, String s){
		int c = a-b;
		System.out.println("C: 3 (2 in +1) s) - sig:"+s+":"+c);
	}
	public void sub(int a, int b, int c){
		int d = a-b;
		System.out.println("C: 3 (3 in) sig:" +d);
	}
    public void sub(int a, String s, int c, String s1){
    	int d = a-c;
    	System.out.println("C: 4 (2 in + 2 Strisig:"+s+":+" +c+":"+ s1);	
	}
	public static void main(String[] arg){
		InheritChild ic = new InheritChild();
		ic.add(2, 3, "ghfhdth");
	}
}
