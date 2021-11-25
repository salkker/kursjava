package pl.teslachorzow.ftablice;

import java.util.Arrays;
import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        int[] randNumbers = new int[20];
        Random random = new Random();

        for (int i = 0; i < randNumbers.length; i++){
            int l = random.nextInt(101);
            randNumbers[i] = l;
        }
        Arrays.sort(randNumbers);
        System.out.println(randNumbers[0]);
        System.out.println(Arrays.toString(randNumbers));
    }
}
