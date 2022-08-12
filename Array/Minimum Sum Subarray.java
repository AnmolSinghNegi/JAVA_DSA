package Array2;

public class minimumSumsubarray {
	static int minSum(int[]array) {
		int minSum=Integer.MAX_VALUE;
		int currSum=0;
		for(int i=0;i<array.length;i++) {
			currSum+=array[i];
			minSum=Math.min(currSum, minSum);
			if(currSum>minSum) {
				currSum=0;
			}
		}
		return minSum;
	}
	public static void main(String args[]) {
		int []array = {6,-7,4,-2,1,5,-4};
		int minSum=minSum(array);
		System.out.println(minSum);
	}
}
