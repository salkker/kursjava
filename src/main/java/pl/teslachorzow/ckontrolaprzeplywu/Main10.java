package pl.teslachorzow.ckontrolaprzeplywu;

public class Main10 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i + 1 > j) {
                    System.out.print(" *");
                } else {
                    System.out.print(" " + j);
                }
            }
            System.out.println(" ");
        }
        for (int g = n; g >= 0; g--) {

            for (int l = 1; l <= n; l++) {
                if (g + 1 > l) {
                    System.out.print(" *");
                } else {
                    System.out.print(" " + l);
                }
            }
            System.out.println(" ");
        }
    }
}
