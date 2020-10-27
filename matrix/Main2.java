package matrix;

public class Main2 {
	public static void main(String[] args) {
		matrix(5,5);
		
	}
		
		public static void matrix(int i, int j) {
		
		int[][] array = new int[i][j];
		int count = 1;
		
		for (int y = 0; y < j; y ++ ){
			array[0][y] = count;
			count++;
		}
		for (int x = 1; x < i; x ++){
			array[x][j-1] = count;
			count ++;
		}
		for (int z = j-2; z>=0; z--) {
			array[i-1][z] = count;
			count ++;
		}
		for (int t = i-2; t>=1; t --) {
			array[t][0] = count;
			count ++;
		}
		
		int a = 1;
		int b = 1;
		while (count < i*j) {
		while (array[a][b+1] == 0) {
			array[a][b] = count;
			count++;
			b++;
		}
		while (array[a+1][b] == 0) {
			array[a][b] = count;
			count++;
			a++;
		}
		while (array[a][b-1] == 0) {
			array[a][b] = count;
			count++;
			b--;
		}
		while (array[a-1][b] == 0) {
			array[a][b] = count;
			count++;
			a--;
		}
		}
		for (int x = 0; x < i; x ++ ){
			for (int y = 0; y < j; y ++)
		
		if (array[x][y] == 0) {
			array[x][y] = count;
		} 
		}
		printMatrix(array);
	}
		 public static void printMatrix(int[][] matrix) {
		        for (int[] array : matrix) {
		            for (int anInt : array) {
		                System.out.print(String.format("%3d", anInt));
		            }
		            System.out.println();
		        }
		 }
}

