import java.util.*;
//maximum sum subarray of size k:used here simple basic approach of sliding window (fixed size)
public class fixedsizewindow {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        int ans = 0;
        int sum = 0;

        while (j < arr.length) {
            sum += arr[j];

            if (j - i + 1 < k) {//size of window(j-i+1)
                j++;
            }

            else if (j - i + 1 == k) {//as we got our desired window size we simply performed the operation said as per depending on question
                ans = Math.max(ans, sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }

        System.out.println(ans);
    }
}

