import java.util.ArrayList;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] i={1,2,3,4,6,7,10};
		System.out.println("Length of i: "+i.length);
		
		List<String> k = new ArrayList<String>();
		
		System.out.println("List Size Before:"+k.size());
		
		for(int j=0;j<i.length;j++){
		   k.add(String.valueOf(i[j]));
		}
		System.out.println("List Size After:"+k.size());
		
		System.out.println(k);
	}

}
