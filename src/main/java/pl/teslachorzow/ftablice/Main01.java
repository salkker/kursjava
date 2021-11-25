package pl.teslachorzow.ftablice;

public class Main01 {
    public static void main(String[] args) {
        int[] mainTab = new int[50];
        String pierwszeLiczby = " ";

        for (int i = 0; i < 50; i++) {
            mainTab[i] = i;

            if (mainTab[i] < 10) {
                pierwszeLiczby = "0" + mainTab[i] + ", ";
            } else{
                pierwszeLiczby = mainTab[i] + ", ";
            }
            if (i % 10 ==0){
                System.out.println();
            }
                System.out.print(pierwszeLiczby);

        }
    }
}
