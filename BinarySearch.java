package com.solution.DSA;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 6, 7, 9, 11, 25, 88, 99};
		int left = 0, right = arr.length-1, middle;
		int sItem = 99;
		
		
		while(left<=right) {
			middle = (left+right)/2;
			if(arr[middle]== sItem) {
				System.out.println("Item founded at index "+middle);
				return;
			}else if(arr[middle]<sItem) {
				left = middle +1;
			}
			else {
				right = middle - 1;
			}
		} 
		System.out.println("Item not founded");

	}

}
