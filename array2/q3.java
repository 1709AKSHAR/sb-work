package array2;

public class q3 {
	 public static void main(String[] args) {
	        int[] arr = {7, 10, 4, 3, 20, 15};
	        int k = 3;
	        java.util.Arrays.sort(arr);
	        int kthMin = arr[k - 1];
	        int kthMax = arr[arr.length - k];
	        System.out.println( kthMin);
	        System.out.println(kthMax);
	    }


}
