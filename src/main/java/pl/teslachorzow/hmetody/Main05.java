package pl.teslachorzow.hmetody;

public class Main05 {
    public static void main(String[] args) {
        double netto = calculateNetto(100, 0.23);
        System.out.println(netto);
    }

    public static double calculateNetto(double gross, double vat){
        return gross-(gross*vat);
    }
}
