/**
 * Created by Suwadith on 5/2/2017.
 */
public class BubbleSort {

    /*
    Time Complexity

    Best: Θ(N)
    Average: Θ(N^2)
    Worst: O(N^2)
     */

    public static void main(String[] args) {

        int[] arr = {12, 5, 8, 2, 1, 80, 12, 15};

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr.length - 1; b++) {
                //Checks whether the next element is smaller than the current element
                if (arr[b] > arr[b + 1]) {
                    //If it's true then saves the next element in variable temp
                    int temp = arr[b + 1];
                    //Sets the current variable's value to the next element
                    arr[b + 1] = arr[b];
                    //Sets the value of the current element to the value that temp holds (Next element's value)
                    arr[b] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
