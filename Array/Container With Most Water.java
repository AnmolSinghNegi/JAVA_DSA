package Array2;

public class containerWithmostWater {
	static int maxArea(int[]array) {
		int maxArea =0;//area cannot be negative
		//two pointer approach 
		int left=0;
		int right =array.length-1;
		while(left<right) {
			int height = Math.min(array[left], array[right]);
			int distance = right -left;
			int area = height* distance;
			maxArea=Math.max(maxArea, area); 
			if(array[left]<array[right])
				left++;
			else
				right--;
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int[]array= {1,8,6,2,5,4,8,3,7};
		int maxArea =maxArea(array);
		System.out.println(maxArea);

	}

}
