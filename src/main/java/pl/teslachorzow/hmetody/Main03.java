package pl.teslachorzow.hmetody;

public class Main03 {
    public static void main(String[] args) {
        int plnWUsd = 10;
        System.out.println(convertToUsd(plnWUsd));
    }

    public static double convertToUsd(double pln){
        return pln/4.24;
    }
}
