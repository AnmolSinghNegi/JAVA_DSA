package Array2;

public class maximumSubarraySum {
	
	static int maxSum(int[]array) {
		//Using kadane's algo
		int currSum=0;
		int size =array.length;
		int maxSum =Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			currSum+=array[i];
			maxSum=Math.max(maxSum,currSum);
			if(currSum<0)currSum=0;
		}
		return maxSum;
	}
	public static void main(String []args) {
		int []array = {6,-3,4,-2,1,5,-4};
		int max= maxSum(array);
		System.out.println(max);
	}

}
