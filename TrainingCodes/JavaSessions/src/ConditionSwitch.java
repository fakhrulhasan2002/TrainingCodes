
public class ConditionSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
        String str;//="my";
        /*int b=5;
        int c=1;
        int d=7;*/
        
        switch(str="java"){
        	case "my": System.out.println("String is my"); 
        	        break;
        	case "class": System.out.println("String is Class"); 
        			break;
        	case "Engg": System.out.println("String is Engg"); 
        			break;
        	case "java": System.out.println("String is Java"); 
        			break;
        	default: System.out.println("invalid"); //break; 
        }
        //do-while is similar to for loop
        /*int i = 0;
        do{
        	
        	System.out.println("Value of i:"+i);
        	i=i+1;
        }while(i<10);*/
        
        
        
        //Nested If condition
        
        /*if(a>b){
        	if(a>c){
        		if(a>d){
        			 System.out.println("a is greater");
        		}else{
        			System.out.println("d is greater than a");
        		}
        	}else{
        		System.out.println("c is greater than a");
        	}
        }else{
        	System.out.println("b is greater than a");
        }*/
        
        
        
        
        
        
        
        
        
        
        ///Multiple if condition
        /*if(a>b && a>c ){
        	System.out.println("a is greater");
        }
        else if(b>c && b>a){
        	System.out.println("b is greater");
        }
        else if(c>a && c>b){
        	System.out.println("c is greater");
        }
        else{
        	System.out.println(" Invalid ");
        }*/
	}

}
