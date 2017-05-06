/**
 * Created by Suwadith on 5/5/2017.
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 1, 3, 7, 2, 10, 9, 8};

        /*# split in half
                m = n / 2

          # recursive sorts
            sort a[1..m]
            sort a[m+1..n]

            # merge sorted sub-arrays using temp array
                b = copy of a[1..m]
            i = 1, j = m+1, k = 1
            while i <= m and j <= n,
                a[k++] = (a[j] < b[i]) ? a[j++] : b[i++]
            → invariant: a[1..k] in final position
            while i <= m,
                a[k++] = b[i++]
            → invariant: a[1..k] in final position*/

        int half = arr.length / 2;



    }

}
