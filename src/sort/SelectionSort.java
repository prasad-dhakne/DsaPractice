package sort;
import java.util.Arrays;

// time complexity  
// best case -  O(n^2)
// worst case - O(n^2)
// is stable - no
// stable means after sorting, the order should be the same for same value element
// that means there are two ten in arrays first is red and second is blue, then after sorting the red 10 must be first
// use case - It performs well on small list and arrays
public class SelectionSort {
	public static void main(String[] args) {
		int[] nums = {5, -1, 2, -9, 0, 45, 1};
		selectionSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void selectionSort(int[] nums) {
		int lastInd;
		for(int i=0; i<nums.length; i++) {
			lastInd = nums.length-i-1;
			int maxInd = maxIndex(nums, lastInd);
			swap(nums, maxInd, lastInd);
		}
		
	}

	private static void swap(int[] nums, int maxInd, int lastInd) {
		int temp = nums[maxInd];
		nums[maxInd] = nums[lastInd];
		nums[lastInd] = temp;	
	}

	private static int maxIndex(int[] nums, int last) {
		int maxInd = 0;
		for(int i=1; i<=last; i++) {
			if(nums[maxInd]<nums[i]) {
				maxInd=i;
			}
		}
		return maxInd;
	}
}
