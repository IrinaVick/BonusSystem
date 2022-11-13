public class Main {
    public static void main(String[] args) {
        int initialAccount = 800;
        int addAmount = 1200;

        int bonus = 0;
        if (addAmount > 1000) {
            bonus = addAmount / 100;
        }

        int totalAmount = initialAccount + addAmount + bonus;

        System.out.println("Итоговый счет: " + totalAmount);
        System.out.println("Бонус: " + bonus);
    }
}