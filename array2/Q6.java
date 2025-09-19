package array2;
import java.util.*;
public class Q6 {
	public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
