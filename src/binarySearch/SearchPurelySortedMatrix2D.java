package binarySearch;
import java.util.*;

// Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the previous row.

public class SearchPurelySortedMatrix2D {
	public static void main(String[] args) {
		int[][] matrix = {
				{1}
		};
		int target = 1;
		System.out.println(Arrays.toString(searchMatrix(matrix, target)));
	}

	private static int[] searchMatrix(int[][] matrix, int target) {
		if(matrix.length==1) {
			return binarySearch(matrix, 0, 0, matrix[0].length-1, target);
		}
		int rStart = 0;
		int rEnd = matrix.length - 1;
		int cMid = matrix[0].length / 2;
		while((rEnd-rStart)>=2) {
			int rMid = rStart + (rEnd - rStart)/2;
			if(target>matrix[rMid][cMid]) {
				rStart = rMid;
			}
			else if(target<matrix[rMid][cMid]) {
				rEnd = rMid;
			}
			else {
				return new int[] {rMid, cMid};
			}
		}
		if(target==matrix[rStart][cMid]) {
			return new int[] {rStart, cMid};
		}
		if(target==matrix[rEnd][cMid]) {
			return new int[] {rEnd, cMid};
		}
		if(target<matrix[rStart][cMid]) {
			return binarySearch(matrix, rStart, 0, cMid-1, target);
		}
		if(target>matrix[rStart][cMid] && target<=matrix[rStart][matrix[rStart].length-1]) {
			return binarySearch(matrix, rStart, cMid+1, matrix[rStart].length-1, target);
		}
		if(target<matrix[rEnd][cMid]) {
			return binarySearch(matrix, rEnd, 0, cMid-1, target);
		}
		else {
			return binarySearch(matrix, rEnd, cMid+1, matrix[rStart].length-1, target);
		}
	}

	// binary search to search in a particular row
	private static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
		while(colStart<=colEnd) {
			int mid = colStart + (colEnd - colStart)/2;
			if(target == matrix[row][mid]) {
				return new int[] {row, mid};
			}
			if(target < matrix[row][mid]) {
				colEnd = mid-1;
			}
			else {
				colStart = mid+1;
			}
		}
		return new int[] {-1, -1};
	}
}
