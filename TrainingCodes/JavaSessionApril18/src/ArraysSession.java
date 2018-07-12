import java.util.ArrayList;
import java.util.List;

public class ArraysSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Defining Arrays
		//data type[] var = {value1, value2};
		//data type var[] = {};
		/*int[] var={1,9,3,6,7,2};
		int a= var.length;
		System.out.println(a);
		for(int i=0;i<a;i++){
			System.out.println(i+":"+var[i]);
		}
		var[5]=10;
		int max=0;
        for (int i = 0; i < a; i++) 
        { 
            if (var[i] > max) 
                     max = var[i]; 
        }
        System.out.println("Max is " + max); 
        
        System.out.println(var[5]);*/
		// data type var[] = new data type[10];
		/*int[] var1 = new int[12];
		var1[0]=100;
		var1[1]=1000;
		var1[11]=10000;
		for(int i=0;i<var1.length;i++){
			System.out.println(var1[i]);
		}*/
		
		List arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(50);
		arr.add(200);
		arr.add(2, 40);
		arr.add(0,70);
		System.out.println(arr.size());
		for(int i=0;i<arr.size();i++)
			System.out.println("Index"+i+":"+arr.get(i));
		
		System.out.println(arr);
	}

}
