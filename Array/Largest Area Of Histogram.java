package Array2;

public class LargestAreaOfHistogram {
	public static void main(String []args) {
		int []array= {2,1,5,6,2,3};
		int largestArea = largestArea(array);
		System.out.print(largestArea);
	}
	public static int largestArea(int[]array) {
		int largestarea=0;
		int len = array.length;
		for(int i=0;i<array.length;i++) {
			int area=0;
			int l=i;
			int r=i;
			int height =array[i];
			while(l>=0) {
				if(array[l]>=height) {
					l--;
				}
				else {
					break;
				}
			}
			l++;
			while(r<len) {
				if(array[r]>=height) {
					r++;
				}
				else {
					break;
				}
			}
			r--;
			int width =r-l+1;
			area = height *width;
			largestarea=Math.max(area, largestarea);
		}
		return largestarea;
	}

}
