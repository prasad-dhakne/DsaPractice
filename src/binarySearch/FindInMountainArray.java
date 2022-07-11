package binarySearch;

public class FindInMountainArray {
	
	static int search(int[] array1, int target) {
		int peak = getPeakIndex(array1);
		int firstTry = binarySearchAcend(array1, target, 0, peak);
		if(firstTry != -1) {
			return firstTry;
		}
		return binarySearchDcend(array1, target, peak+1, array1.length);
	}
	static int binarySearchAcend(int[] nums, int target, int start, int end) {
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(target>nums[mid]) {
				start = mid+1;
			}
			else if(target<nums[mid]) {
				end = mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	static int binarySearchDcend(int[] nums, int target, int start, int end) {
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(target<nums[mid]) {
				start = mid+1;
			}
			else if(target>nums[mid]) {
				end = mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	static int getPeakIndex(int[] array1) {
		int start = 0;
		int end = array1.length -1;
		while(start<end) {
			int mid = start+(end-start)/2;
			if(array1[mid]>array1[mid+1]) {
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		int[] array1 = {11, 24, 33, 47, 5, 3, 1};
		int target = 33;
		int ans = search(array1, target);
		System.out.println(ans);

	}

	

}
