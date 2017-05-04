/**
 * Created by Suwadith on 5/2/2017.
 */
public class InsertionSort {

    public static void main(String[] args) {

        /*
    Time Complexity

    Best: Θ(N)
    Average: Θ(N^2)
    Worst: O(N^2)
     */

        int[] arr = {2, 10, 8, 6, 7, 3};

        for (int a = 0; a < arr.length; a++) {
            //Assume the first element is already sorted and set that to current
            int current = arr[a];
            int b = a - 1;
            while (b >= 0 && arr[b] >= current) {
                arr[b + 1] = arr[b];
                b--;
            }
            arr[b + 1] = current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
