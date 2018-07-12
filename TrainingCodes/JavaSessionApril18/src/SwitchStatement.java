
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Switch for numbers
		/*int a=11;
		switch(a){
		case 0: System.out.println("Case 0");
				break;
		case 1: System.out.println("Case 1");
				break;
		case 2: System.out.println("Case 2");
				break;
		case 3: System.out.println("Case 3");
				break;
		case 9: System.out.println("Case 9");
				break;
		default: System.out.println("Case default");
		
		}*/
		
		//Switch for string
		String a="Feb";
		switch(a){
		case "Jan": System.out.println("Case 0");
				break;
		case "Feb": System.out.println("Case 1");
				break;
		case "Mar": System.out.println("Case 2");
				break;
		case "Nov": System.out.println("Case 3");
				break;
		case "Dec": System.out.println("Case 9");
				break;
		default: System.out.println("Case default");
	}
		//Switch for Char
		char ch='c';
		switch(ch){
		case 'a': System.out.println("Case 0");
				break;
		case 'c': System.out.println("Case 1");
				break;
		case 'b': System.out.println("Case 2");
				break;
		case 'z': System.out.println("Case 3");
				break;
		case 'd': System.out.println("Case 9");
				break;
		default: System.out.println("Case default");
		}
	}
}
