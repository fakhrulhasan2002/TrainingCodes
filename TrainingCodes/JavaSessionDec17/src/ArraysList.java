import java.util.ArrayList;
import java.util.List;

public class ArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array
		String[] str=new String[10];
	
		String[] str1={"aas","dsf","fgr","nyn","cvvr","fdvgsdg","fer"};
		
		//List
		List<String> strlist = new ArrayList();
		for(String s:str1){
		   strlist.add(s);
		}
		System.out.println(strlist);
		System.out.println(strlist.size());
		
	}

}
