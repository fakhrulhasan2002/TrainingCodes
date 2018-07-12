package OopsPackage;

public class ClassSession {
	
	//class/static variables
	public static int i=100;
	private static int j=200;
	protected static String str="defult";
	public static char ch='z';
	
	/*
	 * @return i+j
	 */
	public double functionOne(){
		return i+j;
	}
	
    private void functionTwo(){
    	int k=j-i;
		System.out.println("Sub"+k);
	}

    public void functionThree(){
    	System.out.println("Str: "+str);
    }
    /*
     * @param int char
     */
    protected void functionFour(int a, char c){
    	System.out.println("Char :"+c+":"+a);
	}
	

}
