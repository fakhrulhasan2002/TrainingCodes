
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialization, condition, increment or decrement
		//for
		
		/*for(int i=10;i>=0;i=i-2){
			System.out.println(i);
		    System.out.println("extra");
		}*/
		//while
		/*int i=0;
		while(i<=10){
			System.out.println(i);
			
		}*/
		//do-while
		/*int j=0;
		do{
			System.out.println(j+1);
			//j++;
			++j;
		}while(j<=10);*/
	
	for(int i=0;i<5;i++){
		if(i==4){
			System.out.println(i);
			continue;
		}
		System.out.println("Out of if condition-1:"+i);
		System.out.println("Out of if condition=2:"+i);
		System.out.println("Out of if condition-3:"+i);
	}
	}
}
