
public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if
		/*String[] name = {"Java","Python", "Selenium"};
		for(String str:name){*/
		/*String str="Python";
		    if(str=="Java"){
			    System.out.println("Name is:"+ str);
		        }*/
		   
		//}
		//if else
		    /*if(str=="Java"){
			    System.out.println("Name is:"+ str);
		        }
		    else{
		    	System.out.println("Not Listed");
		    }*/
		//if -else if
		    //String str="Python";
		    /*if(str=="Java"){
			    System.out.println("Name is:"+ str);
		        }
		    else if(str=="Python"){
		    	System.out.println("Name is:"+ str);
		    }
		    else{
		    	System.out.println("Not Listed");
		    }*/
		
		
		//nested if
		    String str1=null;
		    if(str1!= null){
		    	System.out.println("String is not Empty");
		    	if(str1.contains("J")){
		    		   System.out.println("String contains J");
		    	     if(str1=="Java"){
		    	    	 	System.out.println("String is:"+str1);
		    	     }else{
		    	    	 System.out.println("String is not Java");
		    	     }
		    	}
		    	else{
		    		System.out.println("Does not contain J");
		    	}
		    }
		    else
		    {
		       System.out.println("Empty String");	
		    }
		
	}

}
