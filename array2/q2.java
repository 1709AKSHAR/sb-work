package array2;

import java.util.Arrays;

public class q2 {
	    public static void main(String[] args) {
	        int[] arr = {3, 5, 1, 8, -2};
	        Arrays.sort(arr);
	        int min = arr[0];
	        int max = arr[arr.length - 1];
	        System.out.println("Min " + min);
	        System.out.println("Max " + max);
	    }
}