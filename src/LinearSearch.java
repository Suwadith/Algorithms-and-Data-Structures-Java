/**
 * Created by Suwadith on 5/6/2017.
 */
public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {4, 5, 7, 1, 2, 8, 10};
        int number = 1;
        boolean x = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Found");
                x = true;
                break;
            } else {
                x = false;
            }
        }

        if (x == false) {
            System.out.println("Not found");
        }

    }

}
