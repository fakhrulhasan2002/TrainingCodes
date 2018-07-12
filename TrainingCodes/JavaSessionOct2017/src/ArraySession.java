import java.util.ArrayList;
import java.util.List;

public class ArraySession {

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		int[] var={10,15,20,30,100};
		String[] str={"java", "Class","Oct","2017"};
		char ch[]={'a','b','c','d'};
		List<String> list=new ArrayList();
		list.add("array1");
		list.add("array2");
		list.add("array4");
		list.add("array5");
		System.out.println(list.size());
		System.out.println(list.get(3));
		System.out.println(var.length);
		System.out.println(var[3]);
		System.out.println(str[2]);
		System.out.println(ch[3]);

	}

}
