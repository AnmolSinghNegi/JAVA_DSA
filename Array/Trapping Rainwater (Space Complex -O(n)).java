package Array2;

import java.util.Arrays;

public class trappingRainwater {
	static int trap(int[]array) {
		int totalWater = 0;
		//for left support
		int size=array.length;
		int []left = new int [size];
		left[0]=array[0];
		for(int i =1;i<size;i++) {
			left[i]=Math.max(array[i],left[i-1]);
		}
		//System.out.println(Arrays.toString(left));
		//right support 
		int[]right = new int[size];
		right[size-1] = array[size-1];
		for(int i = size-2;i>=0;i--) {
			right[i]=Math.max(array[i],right[i+1]);
		}
		//System.out.println(Arrays.toString(right));
		for(int i=0;i<size;i++) {
			int stored = Math.min(left[i],right[i]) - array[i];
	         totalWater +=stored;
		}
		return totalWater;
	}

	public static void main(String[] args) {
		int []array= {1,0,2,1,0,1,3,2,1,2,1};
		int total = trap(array);
		System.out.print(total);

	}

}
