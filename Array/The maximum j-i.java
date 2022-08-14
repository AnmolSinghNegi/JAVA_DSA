package Array_End;

public class themaximumj_i {

	public static void main(String[] args) {
		int []array= {3,4,5,1,7,2,5,5,4,1};
		System.out.print(maxdistance(array));
	}
	public static int maxdistance(int[]array) {
		int distance =0;
		int size = array.length;
		int[] rightmax= new int[size];
		int[]leftmin= new int[size];
		leftmin[0]=array[0];
		for(int i =1;i<size;i++) {
			leftmin[i]=Math.min(leftmin[i-1],array[i]);
		}
		rightmax[size-1]=array[size-1];
		for(int i =size-2;i>=0;i--) {
			rightmax[i]=Math.max(array[i],rightmax[i+1]);
		}
		int i=0,j=0,n=array.length;
		while(i<n&&j<n) {
			if(leftmin[i]<rightmax[j]) {
				distance=Math.max(distance, j-i);
				j++;
			}
			else
				i++;
		}
		return distance;
	}
	

}
