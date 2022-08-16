package Array_End;

public class majority_Voting {
	public static int findMajority(int[]arr) {
		int vote =0,candidate=-1;
		for(int index =0;index<arr.length;index++) {
			if(vote ==0) {
				candidate =arr[index];
				vote =1;
			}
			else {
				if(arr[index]==candidate) {
					vote++;
				}
				else
					vote--;
			}
		}

	    // Checking if majority candidate occurs more than n/2 times
		vote =0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==candidate) 
				vote++;
		}
		if(vote>(arr.length/2))
			return candidate;
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 1, 2, 3, 4 };
		int majority =findMajority(arr);
		System.out.print("The majority elemnt is : "+ majority);
	}

}
