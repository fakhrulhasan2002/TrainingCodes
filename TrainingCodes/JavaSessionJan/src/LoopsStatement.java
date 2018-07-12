
public class LoopsStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for loop
		//for(intialization;condition;increment/decrement)
		/*for(int i=20; i>0;--i){
			System.out.println(i);
		}*/
		
		//while
		/*int i=0; //initialization
		while(i<20){  //condition
			System.out.println(i);
			i=i+5;  //increment
		}*/
		
		//do while
		/*int i=0; //initialization
		do{
			System.out.println(i);
			i=i+5;     //increment/decrement
		}while(i<20); //condition
		*/
		//for each 
		String str[]={"One","Two","Three","Four","Five","Six"};
		//for(String s: str ){
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
			/*if(str[i]=="Three")
				break;*/
			if(str[i]=="Three")
				continue;
			
			System.out.println("After Loop");
		
		}
		//break

		//continue
	}

}
