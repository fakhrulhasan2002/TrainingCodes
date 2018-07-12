
public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//If
		//If Else
		//boolean b=true;
		int i=10;
		String str[]={"First","Selenium","Java","class","Learning"};
		for(String s:str){
			//System.out.println(s);

					
				/*if(i<5){
					System.out.println("True-"+i);
					if(i>3){
						System.out.println("Nested"+i);
					}
				}else{
					if(i>3){
						System.out.println("Nested-Else"+i);
					}
					System.out.println("False-"+i);
				}*/
			
			if(s=="First" || i==9 )
			{
				System.out.println("1 If-"+s);
			}
			else if(s=="Selenium" && i==9)
			{
				System.out.println("2 If-"+s);
			}
			else if(!(s=="Java")){
				System.out.println("3 If-"+s);
			}
			else{
				System.out.println(s);
			}
	}
		//}
		//If-Else if- Else
		//Nested If
	}

}
