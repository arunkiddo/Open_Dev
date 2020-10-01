package com.search.algorithm;

public class BinarySearch {

	
	
//	iterative way to do binary search
	public boolean binarySearch(int[] num, int value) {
		int start = 0;
		int end = num.length;
		int mid = end / 2;
		while (start < end) {
			mid = (start + end) / 2;
			if (num[mid] == value)
				return true;
			if (num[mid] < value) {
				start = mid + 1;
			}

			if (num[mid] > value) {
				end = mid - 1;
			}
		}
		return false;
	}

	
//	recursive initial wrapper function
	public boolean recursiveBinarySearch(int num[], int value) {
		return recursivefunction(num, 0, num.length, value);
	}

//	Recursive way to do binary search
	public boolean recursivefunction(int num[], int start, int end, int value) {
		int mid = (start + end) / 2;
		if (start >= end)
			return false;
		if (num[mid] == value)
			return true;
		else if (num[mid] < value)
			recursivefunction(num, mid + 1, end, value);
		else
			recursivefunction(num, start, mid - 1, value);
		return false;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		BinarySearch bs = new BinarySearch();
		if (bs.binarySearch(num, 5)) {
			System.out.println("element found");
		} else {
			System.out.println("not found");
		}
	}
}
