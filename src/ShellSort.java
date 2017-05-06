/**
 * Created by Suwadith on 5/5/2017.
 */
public class ShellSort {

    public static void main(String[] args){

        int[] arr = {4, 5, 6, 1, 7, 10, 9};

        /*for(int a=0; a<arr.length; a++){
            for(int b = a+2; b>0&&b<arr.length; b=-2){
                if(arr[b]<arr[b-1]){
                    int temp = arr[b-1];
                    arr[b-1] = arr [b];
                    arr[b] = temp;
                }
            }

        }*/

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
