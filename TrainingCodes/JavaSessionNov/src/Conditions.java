
public class Conditions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loop
		for(int i=0;i<=100;i++){
			System.out.println(i);	
			if(i==50){
				System.out.println("1 - i is "+i );
			}else if(i==60){
				System.out.println("2 - i is "+i );
			}else if (i==70){
				System.out.println("3 - i is "+i );
			}else{
				System.out.println("Unmatched condition");
			}
			System.out.println("Out of condition");
		}
		//continue
		System.out.println("Out of Loop");
	}

}
