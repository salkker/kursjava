package pl.teslachorzow.hmetody;

public class Main07 {
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(24, "even", "odd"));
    }

    public static String checkEvenOdd(int number, String even, String odd){
        if (number % 2 == 0){
            return even;
        } else {
            return odd;
        }
    }
}
