package Array_End;

public class Largestarea {

	public static void main(String[] args) {
	 int []array = {2,4};
	 System.out.print(largestArea(array)); 
	}
	public static int largestArea(int []array) {
		int area =0;
		int h=0,i=0,j=1;
		int height = array[h];
		int width = 0;
		int n = array.length;
		while(h<n) {
			if(i!=-1&&array[h]<=array[i]) {
				width++;
				area=Math.max(area, height*width);
				i--;
			}
			else if(j!=n&&array[h]<=array[j]) {
				width++;
				area=Math.max(area, height*width);
				j++;
			}
			else {
				h++;
				if(h<n) {
				height=array[h];
				i=h;
				j=h+1;
				width =0;
				}
			}
		}
		return area;
	}

}
