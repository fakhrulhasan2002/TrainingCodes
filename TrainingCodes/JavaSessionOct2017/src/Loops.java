
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for
		//for(initialization;condition;increment/decrement)
		
		/*for(int i=0;i<10;i=i+6){
			System.out.println(i);
		}
		for(int i=10;i>0;i=i-2){
			System.out.println(i);
		}*/
		//while
		/*int a=0;
		while(a<10){
			System.out.println(a);
			a++;
		}*/
		
		
		//do - while
		int b=0;
		do{
			b++;
			System.out.println(b);
			
		}while(b<10);
		
		
		//foreach mainly list/array
		String[] str={"a","b","c","d"};
		for(String s:str)
		{
			System.out.println(s);
		}
	}

}
