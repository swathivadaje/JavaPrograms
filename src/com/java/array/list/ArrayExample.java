package com.java.array.list;

import java.util.Arrays;

//Bubble sort

public class ArrayExample 
{
	public static void main(String[] args) 
	{
		int[] intArray = {33, 11, 77, 33, 99, 44, 12, 22, 66, 77, 12};
		int element = 44;
		System.out.println(Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.binarySearch(intArray, element));

	}
}
