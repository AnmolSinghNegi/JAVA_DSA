package MatrixDSA;

public class rotateMartrix {
	static void transpose(int[][]matrix) {
		for(int i =0 ;i<matrix.length;i++) {
			for(int j=i;j<matrix.length;j++) {
				int swap;
				swap =matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=swap;
			}
		}
	}
	static void rotate(int[][]matrix) {
		for(int i =0 ; i<matrix.length; i++) {
			for(int j=0;j<matrix.length/2;j++) {
				int swap = matrix[i][j];
				matrix[i][j]=matrix[i][matrix.length-j-1];
				matrix[i][matrix.length-j-1]=swap;
			}
		}
	}
	static void matrixprint(int[][]matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int [][]matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		transpose(matrix);
		rotate(matrix);
		matrixprint(matrix);
		

	}

}
