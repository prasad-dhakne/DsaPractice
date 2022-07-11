package binarySearch;

public class MountainArrayPick {
	static int search(int[] array1) {
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
		int[] array1 = {3, 6, 41, 55, 77, 441, 32, 14, 5, 2};
		int ans = search(array1);
		System.out.println(ans);
	}
}
