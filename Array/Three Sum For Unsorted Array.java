package Array_End;

import java.util.Arrays;

public class threeSumForunsortedArray {
	public static boolean threeSum(int []array , int target) {
		Arrays.sort(array);
		for(int i =0;i<array.length;i++) {
			if(twoSum(array,target-i)) {
				return true;
			}
			
		}
		return false;
	}
	public static boolean twoSum(int[]array,int target) {
		int left=0;
		int right = array.length-1;
		while(left<right) {
			if(array[left]+array[right]>target) {
				right--;
			}
			else if(array[left]+array[right]<target) {
				left++;
			}
			else {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int []array= {1,2,3,4,7,3,5,-2,-1};
		int target =-2;
		System.out.print(threeSum(array,target));

	}

}
