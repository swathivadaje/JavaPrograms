package com.java.arrays;

import java.util.Arrays;

//Bubble sort

public class AverageOfArrayElements 
{
	public static void main(String[] args) 
	{
		int[] intArray = {33, 11, 77, 33, 99, 44, 11, 22, 66, 77};
		int sum=0;

		System.out.print("Sum of all elements: ");
		for(int i : intArray)
			sum += i;
			System.out.print(sum);
	
	}

}
