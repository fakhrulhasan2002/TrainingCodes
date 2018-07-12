
public class LoopControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i++ same i=i+1;
		//For Loop
		//for(intilization;condition;increment/decrement
		/*for(int i=20;i>0;i=i-5){
			System.out.println(i);
		}*/

		
		//for(defintion:values) --> this kind of foreach
		String str[]={"First","Selenium","Java","class", "Learning"};
		for(String s:str){
			System.out.println(s);
			
		}
		//While
		//initilization
		//condition
		//increament
		/*int i=20;
		while(i>0){
			System.out.println(i);
			i=i-5;
		}*/
		
		//do while
		
		//initilization
		//increment
		//condition
		
		//Break - it breaks the loop when condition is met
		//continue will skip the code defined after continue.
		int i=0;
		do{
			
			i++;
			System.out.println("Before-"+i);
			if(i>=5){
				System.out.println("in If-"+i);
				continue;
			}
			System.out.println("After if-"+i);
			}while(i<10);
	}

}
