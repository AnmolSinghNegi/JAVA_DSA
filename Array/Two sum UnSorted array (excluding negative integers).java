package Array_End;

import java.util.Arrays;

public class twosumUnSortedarray {
	public static int[] twoSum (int []array,int target) {
		int []og = array.clone();
		Arrays.sort(array);
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
				ans[0]=array[left];
				ans[1]=array[right];
				break;
			}
		}
		int i=0;
		for(;i<og.length;i++) {
			if(og[i]==ans[0]) {
				ans[0]=i;
				break;
			}
		}
		for(int j=i+1;j<og.length;j++) {
			if(og[j]==ans[1]) {
				ans[1]=j;
				break;
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int[] array= {1,2,7,10,12,8};
		int target =10;
		System.out.print(Arrays.toString(twoSum(array,target)));
	}

}
