package sort;
import java.util.Arrays;

// time complexity  
// best case -  O(n)
// worst case - O(n^2)
// is stable - yes
// stable means after sorting, the order should be the same for same value element
// that means there are two ten in arrays first is red and second is blue, then after sorting the red 10 must be first

public class BubbleSort {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		bubble(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void bubble(int[] nums) {
		boolean swapped;
		for(int i = 0; i<nums.length-1; i++) {
			swapped = false;
			for(int j = 1; j<nums.length-i; j++) {
				if(nums[j]<nums[j-1]) {
					int temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		
	}
}
