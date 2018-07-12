import java.util.ArrayList;

public class ArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arrays
		/*int arr[]={1,2,3,4,5,6,7,8};
		int arr1[]=new int[10];
		arr[2]=50;
		arr1[0]=12;
		arr1[9]=80;
		//arr1[10]=40;
		System.out.println("ARR 1:"+arr.length);
		System.out.println("ARR 2:"+arr1.length);
		System.out.println(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}*/
		
		//ArrayList
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(2,1000);
		System.out.println("Before Clear: "+list.size());
		System.out.println(list);
		//list.clear();
		System.out.println("After Clear"+list.size());
		if(!list.isEmpty()){
			System.out.println(list.get(3).intValue());
			System.out.println(list);
		}
		else{
			
			System.out.println("List empty");
		}		
		
	}

}
