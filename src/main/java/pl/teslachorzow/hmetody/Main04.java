package pl.teslachorzow.hmetody;

public class Main04 {
    public static void main(String[] args) {
        System.out.println(createName("jan", "kowalski", "kowalSwojegoLosu"));
    }

    public static String createName(String name, String surname, String nickname){
        return String.join(" ", name, nickname, surname) ;
    }
        //return name + " " + nickname + " " + surname;

}
