package binarySearch;

// Rotated Sorted Array 
// Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
// (i.e., [1, 4, 6, 8, 11, 13, 15] might become [8, 11, 13, 15, 1, 4, 6] ). 
// You are given a target value to search. If found in the array return its index, otherwise return -1.
// in Rotated Sorted Array 1) start>pivot+1 and further all elements till end

public class SearchInRotatedSortedArray {
	static int search(int[] array1, int target) {
		int pivot = searchPivot(array1);
		if(pivot == -1) {
			return binarySearch(array1, target, 0, array1.length-1);
		}
		if(array1[pivot] == target) {
			return pivot;
		}
		if(target>=array1[0]) {
			return binarySearch(array1, target, 0, pivot);
		}
		return binarySearch(array1, target, pivot+1, array1.length-1);
	}
	static int binarySearch(int[] nums, int target, int start, int end) {
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
	static int searchPivot(int[] array1) {
		int start = 0;
		int end = array1.length -1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(mid<end && array1[mid]>array1[mid+1]) {
				return mid;
			}
			if(mid>start && array1[mid]<array1[mid-1]){
				return mid-1;
			}
			if(array1[start]>array1[mid]) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array1 = {5, 7, 10, 22, 0, 1, 2, 3, 4};
		int target = 22;
		int ans = search(array1, target);
		System.out.println(ans);

	}
}
