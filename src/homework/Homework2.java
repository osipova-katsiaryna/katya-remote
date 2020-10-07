package homework;

import java.util.Arrays;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
		fillMassive();
		doubleMassive();
		squareMassive();
		maxMin();
		int[] newArray = { 1, 2, 3, 4, 5, 6, 7 };
		sumComparison(newArray);
		shiftingArray(newArray, -3);

	}

	// Task1
	public static void array() {
		int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
		int length = array.length;
		for (int i = 0; i < length; i++) {
			if (array[i] == 1) {
				array[i] = 0;
			} else {
				array[i] = 1;
			}
			System.out.print(array[i]);
			System.out.println();
		}

	}

	// Task2
	public static void fillMassive() {
		int[] mass = new int[8];
		int count = 0;
		for (int i = 0; i < 8; i++) {
			mass[i] = count;
			count += 3;
			// mass[i + 1] = count + 3;
			System.out.println(mass[i]);
		}
	}

	// Task3
	public static void doubleMassive() {
		int[] mass = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		int length = mass.length;
		for (int i = 0; i < length; i++) {
			if (mass[i] < 6) {
				mass[i] *= 2;
			}
			System.out.print(mass[i]);

		}
	}

	// Task4
	public static void squareMassive() {
		int n = 4;
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j == i) || (i == n - 1 - j)) {
					array[i][j] = 1;

					System.out.print(array[i][j] + "\t");
				}

			}
			System.out.println();
		}
	}

	// Task5
	public static void maxMin() {

		int[] massive = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int max = massive[0];
		int min = massive[0];

		for (int i = 0; i < 10; i++) {
			if (massive[i] > max) {
				max = massive[i];

			}
			if (massive[i] < min) {
				min = massive[i];

			}

		}

		System.out.println(min);
		System.out.println(max);

	}

	// Task6
	public static boolean sumComparison(int[] array) {
		int length = array.length;
		int index1 = 0;
		int sum1 = array[index1];
		int index2 = length - 1;
		int sum2 = array[index2];
		while ((index1 < index2)) {
			if (sum1 > sum2) {
				index2 = index2 - 1;
				sum2 = sum2 + array[index2];

			}
			if (sum1 < sum2) {
				index1 = index1 + 1;
				sum1 = sum1 + array[index1];
			}

			if (sum1 == sum2) {
				System.out.println(sum1 + " " + sum2);
				return true;

			}
		}
		System.out.println("no sum matching");
		return false;

	}

	// Task7
	public static void shiftingArray(int[] array, int n) {
		System.out.println("start");
		printArr(array);
		int length = array.length;
		while (n < 0) {
			n = n + length;
		}
		while (n > length) {
			n = n - length;
		}

		for (int i = length - n - 1; i >= 0; i--) {
			int k = i;
			for (int j = 0; j < n; j++) {
				k = i + j;

				swap(array, k, k + 1);

			}

		}
		printArr(array);

	}

	public static void swap(int[] array, int ind1, int ind2) {
		int tmp = array[ind1];

		array[ind1] = array[ind2];
		array[ind2] = tmp;
	}

	public static void printArr(int[] ar) {
		System.out.println("");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}
		System.out.println("");
	}

}
