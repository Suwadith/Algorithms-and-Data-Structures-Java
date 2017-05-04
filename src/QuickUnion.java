/**
 * Created by Suwadith on 5/4/2017.
 */
public class QuickUnion {

    public int[] arr = new int[10];

    public void createArray() {
        for (int a = 0; a < arr.length; a++) {
            arr[a] = a;
        }
    }

    public int root(int i) {
        while (i != arr[i]) {
            i = arr[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return root(p)==root(q);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        arr[i] = j;
    }


}
