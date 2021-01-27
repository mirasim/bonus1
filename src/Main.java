public class Main {
    public static void main(String[] args) {
        int accountBalance = 100_00;
        int paymentAmount = 1500_00;

        int bonusRait  = 100_00;

        int balance = accountBalance + paymentAmount;
        int bonus = 0;
        int finalBalance = 0;

        if (paymentAmount > 1000_00){
            bonus = paymentAmount / bonusRait * 100;
            finalBalance = balance + bonus;
        }else {
            finalBalance = balance;
        }

        System.out.println("текущий баланс = " + balance);
        System.out.println("начисленный бонус = " + bonus);
        System.out.println("итоговый баланс = " + finalBalance);
    }


}