package sort;
import java.util.Arrays;
// time complexity  
// best case -  O(n)
// worst case - O(n^2)
// is stable - Yes
// stable means after sorting, the order should be the same for same value element
// that means there are two ten in arrays first is red and second is blue, then after sorting the red 10 must be first
// use case - It performs well on small list and arrays
// it Works good when array is partially sorted.
public class InsertionSort {
	public static void main(String[] args) {
		int[] nums = {45, -55, -12, -4, 0, 41, 22, 30, 12, 5};
		insertionSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void insertionSort(int[] nums) {
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j>0; j--) {
				if(nums[j]<nums[j-1]) {
					swap(nums, j, j-1);
				}
				else {
					break;
				}
			}
		}
	}

	private static void swap(int[] nums, int j, int i) {
		int temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
		
	}
}
