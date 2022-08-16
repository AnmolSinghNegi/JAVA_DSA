package MatrixDSA;

public class searchElementinrowAndcolumnWIse {
	static boolean search(int[][]matrix,int key) {
		int row=0;
		int col = matrix[0].length-1;
		while(row<matrix.length&&col>=0) {
			if(matrix[row][col]==key) {
				return true;
			}
			else if(matrix[row][col]<key) {
				row++;
			}
			else {
				col--;
			}
		}
		return false;
	}
	public static void main(String []args) {
		int [][]matrix = {{1,4,5,7},{2,5,6,7},{6,10,11,13},{8,12,15,19}};
		int key = 10;
		if(search(matrix,key)) {
			System.out.print("Found");
		}
	}
	

}
