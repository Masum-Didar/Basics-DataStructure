package com.solution.DSA;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = {1, 25, 87, 55, 69, 75};
		int sItem = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==sItem) {
				System.out.println("Iem found at index "+i);
				return;
			}
			
		}
		System.out.println("Item not found ");
	}

}
