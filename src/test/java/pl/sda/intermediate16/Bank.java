package pl.sda.intermediate16;

public class Bank {
    private static Integer balance = 10000;
    public static Integer counter = 0;

    public static void withdraw(Integer howMuch){
        balance = balance - howMuch;
        System.out.println(Thread.currentThread().getName() + " stan konta po wypłacie: " + balance);
    }
    public static void deposit(Integer howMuch){
        balance = balance + howMuch;
        counter = ++counter;
        System.out.println(Thread.currentThread().getName() + " stan konta po wpłacie: " + balance);
    }
}