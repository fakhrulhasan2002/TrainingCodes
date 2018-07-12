import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1[]={"One","Two","Three","Four","Five","Six","Seven","Five","Six","Seven"};
		//str1[10]="dfsgsfd";
		int a = str1.length;
		
		ArrayList<String> arr=new ArrayList();
		for(int i=0;i<a;i++){
			//System.out.println(str1[i]);
			arr.add(str1[i]);
		}
		System.out.println(arr);
		System.out.println(arr.size());
		//Change ArrayList to Set
		Set<String> set = new HashSet(arr);
		set.add("Ten");
		System.out.println("Set:"+set);
		
		//Change Set to Arraylist
		ArrayList<String> clist = new ArrayList(set);
		clist.add(2,"One");
		System.out.println("Set to List:"+clist);
		
	}

}
