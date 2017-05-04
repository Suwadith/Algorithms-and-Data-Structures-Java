/**
 * Created by Suwadith on 5/4/2017.
 */
public class ThreeSumBruteForce {

    /*
    Time Complexity: O(N^3)
     */

    public static void main(String[] args){
        int[] numbers = {30, -40, -20, -10, 40, 0, 10, 5};
        int n = numbers.length;
        int count=0;

        for(int a=0; a<n; a++){
            for(int b=a+1; b<n; b++){
                for(int c=b+1; c<n; c++){
                    if(numbers[a]+numbers[b]+numbers[c]==0){
                        System.out.println(numbers[a]+" "+numbers[b]+" "+numbers[c]);
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }

}
