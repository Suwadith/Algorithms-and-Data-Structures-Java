/**
 * Created by Suwadith on 5/6/2017.
 */
public class BinarySearch {

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};

       int min = 0;
       int max = arr.length-1;
       int number = 9;

       while (min<=max){
           int mid = min + (max - min)/2;
           if(number<arr[mid]){
               max = mid-1;
           }else if(number>arr[mid]){
               min = mid +1;
           }else{
               System.out.println(mid);
               break;
           }
       }

    }

}
