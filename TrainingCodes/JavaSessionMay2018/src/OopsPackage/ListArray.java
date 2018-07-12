package OopsPackage;

import java.util.ArrayList;
import java.util.List;

public class ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array
		/*int a[]={1,2,5,7,9,0,3};
		System.out.println(a.length);
		for(int i=0;i<a.length;i++){
			System.out.println("old"+i+":"+a[i]);
		}
		a[2]=10;
		a[5]=50;
		a[7]=100;
		for(int i=0;i<a.length;i++){
			System.out.println("New"+i+":"+a[i]);
		}*/
		/*String[] array=new String[10];
		System.out.println("Length:"+array.length);
		array[0]="100dsavfadfv";
		for(int i=0;i<b.length;i++){
			System.out.println("New"+i+":"+b[i]);
		}
		array[10]="xv sfdv";
		for(String a:array){
			System.out.println(a);
		}*/
		//array list or list
		List<String> list=new ArrayList();
		System.out.println("intial:"+list.size());
		list.add("fisrt");
		list.add("second");
		list.add("fdssgsdfg");
		System.out.println("intial:"+list);
		list.add(1, "new");
		list.set(0, "fisrtnew");
		System.out.println("end:"+list);
	    //System.out.println(list.get(2));
		list.clear();
		//System.out.println(list.get(2));
		if(!list.isEmpty()){
			System.out.println(list.get(2));
		}else{
			System.out.println("Empty list");
		}
	}

}
