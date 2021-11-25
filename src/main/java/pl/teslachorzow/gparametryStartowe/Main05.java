package pl.teslachorzow.gparametryStartowe;

public class Main05 {
    public static void main(String[] args) {
        int points = Integer.parseInt(args[0]);

        if (points < 0){
            System.out.println("BADVALUE");
        } else if (points > 100) {
            System.out.println("BADVALUE");
        } else if (0 <= points && points <= 50){
            System.out.println("F");
        } else if (51 <= points && points <= 70) {
            System.out.println("E");
        } else if (71 <= points && points <= 90){
            System.out.println("C");
        } else if (91 <= points && points <= 100){
            System.out.println("A");
        }
    }
}
