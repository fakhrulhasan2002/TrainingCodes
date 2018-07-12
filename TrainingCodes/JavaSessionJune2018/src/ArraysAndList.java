import java.util.ArrayList;
import java.util.List;

public class ArraysAndList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int var[]={1,2,3,4,5,6}; 
		String[] var1=new String[10];
		int a = var.length;
		int b = var1.length;
		System.out.println(a+":"+b);
		var[2]=100;
		var1[4]="New";
		var1[6]="Old";
		//System.out.println(var[2]);
		//for(int i=0;i<b;i++){
		for(int s:var){
		System.out.println("var1:"+s);
		}*/
		//}
		List lt=new ArrayList<String>();
		List<Integer>ls=new ArrayList();
		lt.add("New");
		lt.add("Old");
		lt.add("Yes");
		System.out.println(lt);
		lt.add(1, "element");
		ls.add(45);
		ls.add(34);
		lt.addAll(ls);
		int a = lt.size();
		int b = ls.size();
		
		System.out.println(lt);
		System.out.println(lt.get(4));
		
		
		
	}

}
