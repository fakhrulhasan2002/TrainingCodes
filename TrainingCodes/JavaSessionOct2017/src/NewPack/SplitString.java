package NewPack;

public class SplitString {

	int h;
	double i;
	char j;
	String st;
	//constructor
	public SplitString(int a, double b,char c, String s){
		this.h=a;
		this.i=b;this.j=c;this.st=s;
		System.out.println("I am a constructor");
		//System.out.println(a+":"+b+":"+c+":"+s);
	}
	
	public void splitStr(String str){
		String[] str1 = str.split(" ");
		int i=0;
		for(String s:str1){
			System.out.println(i+":"+s);
			i++;
		}
		System.out.println(h+":"+i+":"+j+":"+st);
		
	}
}
