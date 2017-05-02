/**
 * Created by Suwadith on 5/2/2017.
 */
public class InsertionSort {

    public static void main(String[] args){

        int[] arr = {2, 10, 8, 6, 7, 3};

        for(int a=1; a<arr.length; a++){
            int temp = arr[a];
            for(int b=a; b>0 && ; b--){
                if(arr[b+1]<arr[b]){
                    int temp = arr[b+1];
                    arr[b+1]=arr[b];
                    arr[b]=temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

}
