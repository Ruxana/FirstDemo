package BasicPrograms;

import java.util.Arrays;

public class ArraysLargestNumber {

	public static void main(String[] args) {
		int a[]= {12,3,54,67,33};
		int size=a.length;
		Arrays.sort(a);
		System.out.println("sorted Array ::"+Arrays.toString(a));
	      int res = a[size-1];
	      System.out.println("largest element is ::"+res);
		

	}

}
