public class Main {
    public static void main(String[] args) {
        int money = 0;
        int payammount = 1489;

        int bonus;
        if (payammount >= 1000) {
             bonus = payammount / 100;
    } else {
         bonus = 0;}
        int check = money + payammount + bonus;
        System.out.println(check);

    }

       }
