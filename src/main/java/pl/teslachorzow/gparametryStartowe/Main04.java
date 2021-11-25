package pl.teslachorzow.gparametryStartowe;

public class Main04 {
    public static void main(String[] args) {
        int[] parsed = new int [args.length];

        for (int i =0; i < args.length; i++){
            parsed[i] = Integer.parseInt(args[i]);
        }

        if (parsed[0] + parsed[1] > parsed[2] && parsed[2] + parsed[1] > parsed[0] && parsed[0] + parsed[2] > parsed[1]){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

