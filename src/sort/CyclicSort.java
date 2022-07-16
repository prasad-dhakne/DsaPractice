package sort;

import java.util.Arrays;

// time complexity - O(n)
// when given array is in the range from 1 to n  then use cyclic sort
// where n is length of array

public class CyclicSort {
	public static void main(String[] args) {
		int[] nums = {2, 1, 3, 5, 4, 6};
		//System.out.println("hello");
		cyclic(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void cyclic(int[] nums) {
		int i = 0;
		while(i<nums.length) {
			int correctInd = nums[i]-1;
			if(nums[i]!=nums[correctInd]) {
				swap(nums, i, correctInd);
			}
			else {
				i++;
			}
		}
		//System.out.println(Arrays.toString(nums));
		
	}

	private static void swap(int[] nums, int i, int correctInd) {
		int temp = nums[i];
		nums[i] = nums[correctInd];
		nums[correctInd] = temp;
		
	}
}
