package Array_End;

import java.util.Arrays;

public class maximumGap {

	public static void main(String[] args) {
		int []array= {1,6,9,3};
		System.out.print(maximumGap(array));
		
	}
	 public static int maximumGap(int[] nums) {
	        if(nums.length<2)
	            return 0;
	        Arrays.sort(nums);
	        int gap=Integer.MIN_VALUE;
	        for(int i=1;i<nums.length;i++){
	            gap=Math.max(gap,nums[i]-nums[i-1]);
	        }
	        return gap;
	    }
}
