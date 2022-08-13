package Array2;

public class bestTimetobuyStockII {
	static int maxprofit(int []array){
		int profit =0;
		for(int i=1;i<array.length;i++) {
			if(array[i]>=array[i-1]) {
				profit+=array[i]-array[i-1];
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		int []array = {7,1,5,3,6,4};
		int profit = maxprofit(array);
		System.out.print(profit);
	}

}
