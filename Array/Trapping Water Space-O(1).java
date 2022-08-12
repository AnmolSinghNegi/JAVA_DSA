package Array2;

public class trappingwaterSpaceO1 {

	public static void main(String[] args) {
		int []array= {3,5,1,4,2,6};
		System.out.print(trap(array));

	}
	static int trap(int []array) {
		int ans =0;
		int left = 0;
		int right =array.length-1;
		int leftmax=0,rightmax=0;
		while(left<right) {
			if(array[left]<=array[right]){
				if(array[left]>leftmax) {
					leftmax=array[left];
				}
				else
					ans+=leftmax-array[left];
				left++;
			}
			else {
				if(array[right]>rightmax) {
					rightmax=array[right];
				}
				else
					ans+=rightmax-array[right];
				right++;
			}
		}
		return ans;
		
	}

}
