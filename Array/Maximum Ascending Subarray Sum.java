package Array2;

public class maximumAscendingSubarraySum {
	static int maxSum(int []array) {
		int currSum=array[0];
		int max = Integer.MIN_VALUE;
		for(int i=1;i<array.length;i++) {
			if(array[i-1]>=array[i]) {
				max=Math.max(max,currSum);
				currSum=0;
			}
			currSum+=array[i];
			max=Math.max(max,currSum);
		}
		max=Math.max(max,currSum);
		return max;	
	}

	public static void main(String[] args) {
		int []array = {100,10,5};
		int max = maxSum(array);
		System.out.print(max);
	}

}
