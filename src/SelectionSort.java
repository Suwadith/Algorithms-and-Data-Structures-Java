/**
 * Created by Suwadith on 5/2/2017.
 */
public class SelectionSort {

    public static void main(String[] args){

        int[] arr = {20, 10, 5, 50, 60};

        for(int a=0; a<arr.length-1; a++){
            int small = a;
            for(int b=a+1; b<arr.length; b++){
                if(arr[b]<arr[small]){
                    int temp = arr[b];
                    arr[b]=arr[a];
                    arr[a]=temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

}
