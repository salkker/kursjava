package pl.teslachorzow.ftablice;

import java.util.Arrays;

public class Main06 {
    public static void main(String[] args) {
        int[] numbers = {5,2,76,4,3,67,7,41,9,13};
        int[] secondNumbers = {11,31,13,14,15,4,17,18,79,2};
        int[] thirdNumbers = new int[10];

        for (int i = 0; i < 10; i++){
            thirdNumbers[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println(Arrays.toString(thirdNumbers));
    }
}
