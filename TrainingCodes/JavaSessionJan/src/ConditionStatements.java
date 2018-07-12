
public class ConditionStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if
		/*String str[]={"One","Two","Three","Four","Five","Six"};
		int j=100;
		for(int i=0;i<str.length;i++){
			//System.out.println(str[i]);
			if(str[i]=="Three" || j==10)//==, !=, <=, => ,< ,>
				System.out.println(str[i]);
			else if(str[i]=="Four" && j==100){
				System.out.println(str[i]);
			}
			else if(str[i]!="One"){
				System.out.println(str[i]);
			}
			else
				System.out.println("String not found");
				
		}*/
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++)
			{
				if(i==5 && j==8)
				 System.out.println("Cond 1:" + i +":" + j);	
				else if(i==5 || j==3)
					 System.out.println("Cond 2:" + i +":" + j);	
				else{
					
				}
			}
		}
		
		//if-else
		
		//if-elseif-else

		
		//logical operator 
		//&& AND
		//|| OR
		//! NOT

	}

}
