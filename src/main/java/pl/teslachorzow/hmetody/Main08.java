package pl.teslachorzow.hmetody;

public class Main08 {
    public static void main(String[] args) {
        System.out.println(maxOfThree(12, 24, 56));
    }

    public static int maxOfThree(int one, int two, int three) {
        if (one > two && one > three) {
            return one;
        }
        else if (two > one && two > three) {
            return two;
        }
        else if (three > one && three > two) {
            return three;
        }
        return 0;
    }
}
