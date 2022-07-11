package binarySearch;

public class SearchFromInfiniteSortedArray {
//	consider that you don't know the length of array.
	static int search(int[] nums, int target) {
		int start = 0;
		int end = 1;
		while(target>nums[end]) {
			int temp = end+1;
			end = end+(end-start+1)*2;
			start = temp;
		}
		int ans = binarySearch(nums, target, start, end);
		
		return ans;
	}
	static int binarySearch(int[] nums, int target, int start, int end) {
		while(start<=end) {
			int mid = (start + end)/2;
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
		return 0;
	}
	public static void main(String[] args) {
		int[] nums = {2, 4, 7, 12, 19, 25, 44, 89, 345, 2345};
		int target = 2345;
		int ans = search(nums, target);
		System.out.println(ans);
	}
}
/*   [2, 4, 7, 12, 19, 25]
 	  0  1  2  3   4   5
 */