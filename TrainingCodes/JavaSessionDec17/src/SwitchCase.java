
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Switch and case with String
		/*String str[]={"First","Selenium","Java","class","Learning"};
		for(String s:str){
	    s="My";
		switch(s){
		case "First":
			System.out.println("I am "+s);
			break;
		case "Selenium":
			System.out.println("I am "+s);
			break;
		case "class":
			System.out.println("I am "+s);
			break;
		default:
			System.out.println("Default- I am "+s);*/
		
		//Switch with numbers
		/*for(int i=0;i<10;i++){
		
			switch(i){
			case 1:
				System.out.println("I am"+i);
				break;
			case 2:
				System.out.println("I am"+i);
				break;
			case 3:
				System.out.println("I am"+i);
				break;
			case 9:
				System.out.println("I am"+i);
				break;
			default:
				System.out.println("D- I am"+i);
					
			}
		}*/
		
		char ch[]={'a','b','c','m','n','p','z'};
		for(char c:ch){
			switch(c){
			case 'a':
				System.out.println("I am "+c);
				break;
			case 'b':
				System.out.println("I am "+c);
				break;
			case 'c':
				System.out.println("I am "+c);
				break;
			case 'd':
				System.out.println("I am "+c);
				break;
			case 'm':
				System.out.println("I am "+c);
				break;
			default:
				System.out.println("D-I am "+c);
					
			}
		}	
	}

  }
