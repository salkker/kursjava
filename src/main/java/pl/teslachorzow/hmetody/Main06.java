package pl.teslachorzow.hmetody;

public class Main06 {
    public static void main(String[] args) {
        int age = 18;
        System.out.println(checkMaturity(age));
    }

    public static boolean checkMaturity(int age){
        if (age >= 18){
            return true;
        } else {
            return false;
        }
    }
}
