import java.util.Scanner;

/**
 * Created by Suwadith on 5/2/2017.
 */
public class GreatestCommonDivisor {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("First Number: ");
        int x = sc.nextInt();
        System.out.println("Second Number: ");
        int y = sc.nextInt();

        int large, small;

        //Swaps and makes sure that the largest number gets stored inside variable large
        if(x>y){
            large = x;
            small = y;
        }else{
            large = y;
            small = x;
        }

        int remainder=1;

        //Operation Executes until Remainder is .
        //If Remainder is 0 then that means we have found the GCD.
        while(remainder!=0){
            if(large%small==0){
                remainder = 0;
            }else{
                remainder=large%small;
                large=small;
                small=remainder;
            }
        }
            System.out.println(small);
    }

}
