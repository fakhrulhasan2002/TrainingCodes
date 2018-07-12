
public class InheritParent {
	int a;
	int b;
	int c;
	//Overloading - Static Poly, Compile-time Poly, 
	
	public void add(int a, int b){
		int c = a+b;
		System.out.println("P: 2 sig:" +c);
	}
	public void add(int a, int b, String s){
		int c = a+b;
		System.out.println("P: 3 (2 in +1) s) - sig:"+s+":"+c);
	}
	public void add(int a, int b, int c){
		int d = a+b;
		System.out.println("P: 3 (3 in) sig:" +d);
	}
    public void add(int a, String s, int c, String s1){
    	int d = a+c;
    	System.out.println("P: 4 (2 in + 2 Strisig:"+s+":+" +c+":"+ s1);	
	}

}
