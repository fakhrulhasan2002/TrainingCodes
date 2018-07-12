/**
 * 
 */

/**
 * @author Fakhrul
 *
 */
public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //i++ same as i=i+2
		/*for(int i=10;i>0;i=i-2)
		{
			System.out.println(i);
		}*/
		/*int i=0;
		while(i<=10){
			System.out.println(i);
			i=i+2;
		}*/
		/*int i=0;
		do{
			System.out.println(i);
			i++;
		}while(i<=10);*/
		
		/*//break
		for(int i=0;i<=10;i++){
			System.out.println(i);
			if(i==5)
				break;
				
		}*/
		//continue
		for(int i=0;i<=10;i++){
			System.out.println(i);
			if(i==5 || i==4)
		        continue;
		   
			System.out.println("After continue");
		}
	}
}
