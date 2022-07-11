package binarySearch;
import java.util.*;

public class FirstPositionAndLastPosition {
	static int[] myFunction(int[] nums, int target) {
		int[] ans = {-1, -1};
		ans[0] = search(nums, target, true);
		if(ans[0]!=-1) {
			ans[1] = search(nums, target, false);
		}
		return ans;
	}
	
	static int search(int[] nums, int target, boolean isLessThanMid) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(target>nums[mid]) {
				start = mid + 1;
			}
			else if(target<nums[mid]) {
				end = mid - 1;
			}
			else {
				ans = mid;
				if(isLessThanMid) {
					end = mid - 1;
				}
				else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 1, 1};
		int target = 1;
		System.out.println(Arrays.toString(myFunction(nums, target)));

	}

}
