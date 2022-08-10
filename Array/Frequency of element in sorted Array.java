package Array2;

public class frequency {
	
	static void frequency (int[]array,int size) {
		int freq =1;
		for(int i =1;i<size;i++) {
			if(array[i-1]==array[i]) {
				freq++;
			}
			else {
				System.out.println("Frequency of "+array[i-1]+" is: "+freq);
				freq=1;
			}
		}
		if(array[size-2]!=array[size-1]) {
			System.out.println("Frequency of "+array[size-1]+" is: "+freq);
		}
	}

	public static void main(String[] args) {
		int []array = {1, 1, 1, 2, 3, 3, 5, 5,8, 8, 8, 9, 9, 10 };
		int size = array.length;
		frequency(array,size);
	}

}
