package B1;

public class Main {
    public static void main(String[] args) {
        Account acc1 = Account.getInstance();
        Account acc2 = Account.getInstance();
        Account acc3 = Account.getInstance();
        System.out.println(acc1 == acc3);
        System.out.println(acc1 == acc2);
    }
}
