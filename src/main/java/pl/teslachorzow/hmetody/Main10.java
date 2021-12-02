package pl.teslachorzow.hmetody;

public class Main10 {
    public static void main(String[] args) {
        System.out.println(footballWin(2,3,3,2));
    }

    public static String footballWin(double mecz1a, double mecz1b, double mecz2a, double mecz2b ){
        mecz1b = mecz1b*1.1;
        mecz2a = mecz2a*1.1;

        if (mecz1a+mecz2a < mecz2b+mecz1b){
            return "2";
        } else if (mecz1a+mecz2a > mecz2b+mecz1b){
            return "1";
        } else {
            return "X";
        }
    }
}
