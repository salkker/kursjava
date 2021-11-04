package pl.teslachorzow.ckontrolaprzeplywu;

public class Main05 {
    public static void main(String[] args) {
        int resultsFor = 0;
        for (int i = 0; i<11; i++){
            resultsFor = resultsFor + i;
        }
        System.out.println(resultsFor);


        int resultsWhile = 0;
        int a = 0;
        while (a < 11){
            resultsWhile = resultsWhile + a;
            a++;
        }
        System.out.println(resultsWhile);
    }
}
