package pl.teslachorzow.etablice;

import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {
        int[] tab1 = {23, 45, 78, 34, -4, -1};
        int[] tab2 = new int[]{23, 45, 78, 34, -4, -1};

        System.out.println(Arrays.toString(tab1));

        System.out.println(Arrays.equals(tab1,tab2));

        Arrays.sort(tab1);
        System.out.println(Arrays.toString(tab1));
    }
}

