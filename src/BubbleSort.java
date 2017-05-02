/**
 * Created by Suwadith on 5/2/2017.
 */
public class BubbleSort {

    public static void main(String[] args){

        int[] arr = {12, 5, 8, 2, 1,80, 12, 15};

        for(int a = 0; a<arr.length; a++){
            for(int b = 0; b<arr.length-1; b++){
                if(arr[b]>arr[b+1]){
                    int temp = arr[b+1];
                    arr[b+1] = arr[b];
                    arr[b] = temp;
                }
            }
        }

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
