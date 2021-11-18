package pl.teslachorzow.ckontrolaprzeplywu;

public class Main11 {
    public static void main(String[] args) {
        int n = 20;

        for (int i = 0; i <= n; i++) {

            if (i % 2 == 0) {
                    System.out.print(" " + i);
                } else {
                    System.out.print(" *");
                }
            }
        }
    }
