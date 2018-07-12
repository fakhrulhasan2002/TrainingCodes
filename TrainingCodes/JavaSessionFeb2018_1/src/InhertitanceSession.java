
public class InhertitanceSession {

	public int num1;
	public int num2;
	public int Tot;
	
	//constructor
	/*public InhertitanceSession(int x, int y){
		num1=x;
		num2=y;
	}*/
	public void Addition(){
		Tot=num1+num2;
		System.out.println("No Parameter:"+Tot);
	}
	
	public void Addition(int x){
		Tot=num1+num2+x;
		System.out.println("One Parameter:"+Tot);
	}
	public void Addition(int x, int y){
		Tot=num1+num2+x+y;
		System.out.println("Two Parameters:"+Tot);
	}
	public void Addition(int x, int y, String str){
		Tot=num1+num2+x+y;
		System.out.println("Two Parameters:"+str+":"+Tot);
	}
	
	public void div(){
		try{
			Tot=num1/num2;
			System.out.println("P:Div:"+Tot);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Finally");
		}

		}
	
	
	
}
