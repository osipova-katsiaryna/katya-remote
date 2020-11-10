package lesson3;

public class Method1<T> {
	private T[] nums;

	

	public void swap(T[] nums, int i, int j) {
			T temp;
			temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;

		}
}
	


