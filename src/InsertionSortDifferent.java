/**
 * Created by Suwadith on 5/5/2017.
 */
public class InsertionSortDifferent {

    public static void main(String[] args){

        int[] arr = {4, 5, 7, 1, 9, 2};

        for(int a=0; a<arr.length-1; a++){
            for(int b=a+1; b>0; b--){
                if(arr[b]<arr[b-1]){
                    int temp = arr[b-1];
                    arr[b-1] = arr[b];
                    arr[b]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
