package Array2;

public class maxlengthofSubarraycontainigzerosandones {

	public static void main(String[] args) {
		int []arr= {0,1,0,1,0,1,0,1,1,1,0,1};
		System.out .print(maxlength(arr));

	}
	public static int maxlength(int []arr) {
		int maxlength=0;
		for(int start =0;start<arr.length;start++) {
			int zeros=0,ones=0;
			for(int end = start;end<arr.length;end++) {
				if(arr[end]==0) {
					zeros++;
				}
				else {
					ones++;
				}
				if(zeros==ones) {
					maxlength=Math.max(maxlength, end-start+1);
				}
			}
		}
		return maxlength;
	}

}
