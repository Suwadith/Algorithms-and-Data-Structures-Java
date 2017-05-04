/**
 * Created by Suwadith on 5/2/2017.
 */
public class SelectionSort {

    /*
    Time Complexity

    Best: Θ(N^2)
    Average: Θ(N^2)
    Worst: O(N^2)
     */

    public static void main(String[] args) {

        int[] arr = {20, 10, 5, 50, 60};

        for (int a = 0; a < arr.length - 1; a++) {
            //sets the value of the variable small to the first element of the outer loop
            int small = a;
            //This loop begins to iterate 1 position in front of the main loop
            for (int b = a + 1; b < arr.length; b++) {
                //Checks if the current element is smaller than the smallest element of the array
                if (arr[b] < arr[small]) {
                    //Swaps accordingly
                    int temp = arr[b];
                    arr[b] = arr[a];
                    arr[a] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
