package pl.teslachorzow.hmetody;

public class Main09 {
    public static void main(String[] args) {
        System.out.println(factorial(2));
    }

    public static int factorial(int n){
        int j = n;
        for (int i = 0; i <= j; i++){
        n = j * i;
        }
        return n;
    }
}
