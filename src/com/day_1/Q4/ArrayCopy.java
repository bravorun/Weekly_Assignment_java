package com.day_1.Q4;
public class ArrayCopy {
		public static void main(String[] args) {
			int arr[]= {2,5,4,3,7,6};
			int result[];
			result=copyOf(arr);
			for(int i:result)
				System.out.println(i);

		}
		public static int[] copyOf(int [] array) {
			int arr[]=new int[array.length];
					for(int i=0;i<arr.length;i++) {
						arr[i]=array[i];
					}
					return arr;
		}

	}

