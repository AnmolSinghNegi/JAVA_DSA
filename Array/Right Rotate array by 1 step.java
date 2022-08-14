package Array_End;

import java.util.Arrays;

public class rightRotatearrayby1step {
	public static void rRby1(int []array) {
		int last = array[array.length-1];
		for(int i =array.length-1;i>0;i--) {
			array[i]=array[i-1];
		}
		array[0]=last;
		System.out.print(Arrays.toString(array));
	}

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7};
		rRby1(array);

	}


}
