package SetofPrograms;

import java.util.Arrays;

public class reversearray {

	public static void main(String[] args) {
		int[]array= {2,3,4,5,6,9};
		int start=0;
		int end=array.length-1;
		while(start<end) {
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
		System.out.println("reverse array is "+Arrays.toString(array));

	}

}
