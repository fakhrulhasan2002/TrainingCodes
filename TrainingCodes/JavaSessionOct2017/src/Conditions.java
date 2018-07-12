
public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if
		String[] str={"Ram","Mohan","Steve", "Akash"};
		for(String s:str){
			if((s.equals("Mohan")&& s.equals("Steve"))){
				System.out.println("name Exists");
		
			}
			else{
				System.out.println("Name doesn't exists in list");
			}
		}
		
		//if-else
		
		//if-else if-else
		
		//switch
		/*String[] str2={"Jan","Feb","Mar","Apr","June","Dec"};*/
		/*for(String s:str2){*/
		int b =10;
		int c = 5;
		int a;
		String s="Mul";
		switch(s){
				case "Add":
					a=b+c;
					System.out.println("Add:"+a);
				    break;
				case "Sub":
					a=b-c;
					System.out.println("Sub:"+a);
					break;
				case "Mul":
					a=b*c;
					System.out.println("Mul:"+a);
					break;
				case "Div":
					a=b/c;
					System.out.println("Div"+a);
					break;
				default:
					System.out.println("Months case not defined");
		}
	 }
}
