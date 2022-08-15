package Array_End;

import java.util.Arrays;

public class twosumSortedarray {
	public static int[] twoSum (int []array,int target) {
		int [] ans = {-1,-1};
		int left =0;
		int right =array.length-1;
		while(left<right) {
			int currSum = array[left]+array[right];
			if(currSum<target) {
				left++;
			}
			else if(currSum>target)
				right--;
			else {
				ans[0]=left;
				ans[1]=right;
				break;
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int[] array= {-5,-4,-3,-2,-1};
		int target =-8;
		System.out.print(Arrays.toString(twoSum(array,target)));

	}

}
