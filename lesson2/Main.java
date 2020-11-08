package lesson2;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String[][] array1 = new String[4][4];
		array1[0][0] = "1";
		array1[0][1] = "34";
		array1[0][2] = "34";
		array1[0][3] = "8";
		array1[1][0] = "34";
		array1[1][1] = "34";
		array1[1][2] = "2";
		array1[1][3] = "4";
		array1[2][0] = "45";
		array1[2][1] = "78";
		array1[2][2] = "678";
		array1[2][3] = "3";
		array1[3][0] = "123";
		array1[3][1] = "467";
		array1[3][2] = "7";
		array1[3][3] = "678";
		
		int sum = 0;
		Array array = new Array();
		
		try {
			sum = array.arraySize(array1);
			System.out.println("Result: " + sum);
		} catch (MyArrayDataException | MyArraySizeException e) {
			System.out.println(e.getMessage());
		}	

	}

}
