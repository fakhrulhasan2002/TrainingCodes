package calculator;
public class Calculator {

			//Attributes
		    int c;
			private int z;
			protected int y;
	        
	        //Methods
			final public void addition(int a,int b){
				c= a+b;
				System.out.println("Parent-Addition:"+c);	
			}
			public void addition(int a,int b,int c){
				c= a+b+c;
				System.out.println("Addition:"+c);	
			}
			public void addition(int a,int b,int c,int d){
				c= a+b+c;
				System.out.println("Addition:"+c);	
			}
			private void subtraction(int a,int b){
				c=a-b;
				System.out.println("Subtraction:"+c);
			}
			public void multiplication(int a,int b){
				c= a*b;
				System.out.println("Multiplcation:"+c);
				
			}
			public void division(int a,int b){
				try{
					c=a/b;
					System.out.println("Division:"+c);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			public void getvalueOfZ(int a,int b){
				z=a;
				System.out.println(z);
				subtraction(a, b);
			}

			/*public static void main(String[] arg){
				Calculator cal=new Calculator();
				cal.addition(20,30);
				cal.division(2, 0);
				cal.subtraction(20, 5);
				cal.multiplication(5, 9);
				
			}*/

}
