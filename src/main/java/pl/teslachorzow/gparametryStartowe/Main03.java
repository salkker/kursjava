package pl.teslachorzow.gparametryStartowe;

public class Main03 {
    public static void main(String[] args) {
        int suma = 0;
        int srednia = 0;

        for (int i =0; i<args.length; i++){
            suma += Integer.parseInt(args[i]);
        }
        srednia = suma / args.length;
        System.out.println(srednia);
    }
}
