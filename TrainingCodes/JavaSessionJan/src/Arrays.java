import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[10];
		//String str8[] = str8[10];// = new String[10];
		str[0]="One1";
		str[1]="Two2";
		System.out.println("Static Length:"+str.length);
		for(String s: str)
		 System.out.println("Static:"+s);
		ArrayList<String> arr=new ArrayList();
		
		String str1[]={"One","Two","Three","Four","Five","Six","Seven","Five","Six","Seven"};
		//str1[10]="dfsgsfd";
		int a = str1.length;
		System.out.println("Length:"+a);
		for(int i=0;i<a;i++){
			//System.out.println(str1[i]);
			arr.add(str1[i]);
		}
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.get(5));
		//arr.clear();
		
		arr.remove(3);
		System.out.println(arr.size());
		System.out.println(arr);
		arr.add(3, "New");
		System.out.println(arr.size());
		System.out.println(arr);
		
			
		
	}

}
