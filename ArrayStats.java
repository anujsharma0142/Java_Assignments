package com.monocept.task;

import java.util.Arrays;

public class ArrayStats {

	public static void main(String[] args) {
		int arr[] = new int[args.length];
		int num = arr.length;
		
		for(int i=0; i<num; i++) {
			arr[i]= Integer.parseInt(args[i]);
		}
		
		int sum = 0;
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
			min = Math.max(arr[i], min);
			max = Math.min(arr[i], max);
		}
		double  avg = sum/num;
		int median = 0;
		
		Arrays.sort(arr);
		if(num%2 ==0) {
			median = (arr[(num/2)-1] + arr[num/2]);
		}
		
		else {
			median = (arr[(num+1)/2]-1);
		}
		
		System.out.println("Sum of Number : " + sum);
		System.out.println("Minimum number of array is :" + min);
		System.out.println("Maximum number of array is : "+ max);
		System.out.println("Average "+ avg);
		System.out.println("Median is : " + median);
		
		
		int count = 0;
		for(int i=0; i<num; ++i) {
			num = arr[i];
			
			if(num == -1)
				continue;
		}
		for(int j=0; j<num; ++j) {
			if(arr[j]==num)
		
			count++;
			arr[j]=-1;
		}
		System.out.println("Frequency of each element in the array : " + arr + count );
		
	}
}
