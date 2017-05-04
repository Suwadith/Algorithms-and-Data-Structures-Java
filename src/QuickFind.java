/**
 * Created by Suwadith on 5/4/2017.
 */
public class QuickFind {

    public int[] arr = new int[10];

    public void createArray(){
        for(int a=0; a<arr.length; a++) {
            arr[a] = a;
        }
    }

    public boolean connected(int p, int q){
        return arr[p]==arr[q];
    }

    public void union(int p, int q){

        int pID = arr[p];
        int qID = arr[q];

        for(int a=0; a<arr.length; a++){
            if(arr[a] == pID){
                arr[a] = qID;
            }
        }
    }

    public static void main(String[] args){



    }

}
