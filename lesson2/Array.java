package lesson2;

public class Array {

	public int arraySize(String[][] array) throws MyArraySizeException, MyArrayDataException {

		int sum = 0;
		int size = array.length;
		int size2 = array[0].length;
		
		if (size != 4 || size2 != 4) {
			throw new MyArraySizeException("Size incorrect. Expected 4x4. Got " + size + "x" + size2);
		}
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {				
				try {
					sum += Integer.parseInt(array[i][j]);
				} catch (NumberFormatException ex) {
					throw new MyArrayDataException("Cell [" + i + "," + j + "] has invalid number value: " + array[i][j]);
				}
			}
		}
		return sum;
	}
}
