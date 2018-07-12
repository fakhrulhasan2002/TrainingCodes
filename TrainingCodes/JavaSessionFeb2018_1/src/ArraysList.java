import java.util.ArrayList;
import java.util.List;

public class ArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List strlist=new ArrayList<String>();
		List intlist=new ArrayList<Integer>();
		
		strlist.add("This");
		intlist.add(10);
		strlist.add("is");
		intlist.add(20);
		strlist.add("my");
		intlist.add(30);
		strlist.add("Java");
		intlist.add(40);
		strlist.add("class");
		intlist.add(50);
		strlist.add(2, "extra");
		intlist.add(3, 300);
		System.out.println(strlist.size());
		System.out.println(intlist.size());
		System.out.println(strlist);
		System.out.println(intlist);
		strlist.removeAll(strlist);
		intlist.removeAll(intlist);
		System.out.println(strlist);
		System.out.println(intlist);
	}

}
