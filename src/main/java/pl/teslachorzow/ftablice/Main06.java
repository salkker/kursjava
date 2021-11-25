package pl.teslachorzow.ftablice;

import java.util.Arrays;

public class Main06 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] secondNumbers = {11,12,13,14,15,16,17,18,19,20};
        int[] thirdNumbers = new int[10];

        for (int i = 0; i < 10; i++){
            thirdNumbers[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println(Arrays.toString(thirdNumbers));
    }
}
