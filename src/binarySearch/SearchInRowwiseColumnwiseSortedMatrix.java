package binarySearch;
import java.util.*;

public class SearchInRowwiseColumnwiseSortedMatrix {
	
	public static void main(String[] args) {
		int[][] matrix = {
				{10, 20, 30, 40},
				{15, 26, 37, 48},
				{19, 28, 41, 52},
				{30, 32, 55, 66}
		};
		int target = 19;
		System.out.println(Arrays.toString(searchMatrix(matrix, target)));
	}

	private static int[] searchMatrix(int[][] matrix, int target) {
		int row = 0;
		int column = matrix.length-1;
		while(row<matrix.length && column>=0) {
			if(target==matrix[row][column]) {
				return new int[] {row, column};
			}
			else if(target<matrix[row][column]) {
				column--;
			}
			else {
				row++;
			}
		}
		return new int[]{-1, -1};
	}
}
