package Array2;

public class elementsOfmaximumSum {
	static void ele(int[]array) {
		int currSum=0;
		int start=0;
		int end=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			currSum+=array[i];
			if(currSum>maxSum) {
				maxSum=currSum;
				end=i;
			}
			if(currSum<0) {
				currSum=0;
				start=i+1;
			}
		}
		System.out.print(maxSum);
		for(int i=start;i<=end;i++) {
			System.out.print(array[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		int []array = {6,-3,4,-2,1,5,-4};
		ele(array);

	}

}
