public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double percent = 9.99;
        int months;
        System.out.println();
        System.out.println("Ежемесячный платеж при оформлении кредита на 12 месяцев составит: ");
        System.out.println(service.calculate(amount, percent, months = 12) + " руб.");
        System.out.println();
        System.out.println("Ежемесячный платеж при оформлении кредита на 24 месяца составит: ");
        System.out.println(service.calculate(amount, percent, months = 24) + " руб.");
        System.out.println();
        System.out.println("Ежемесячный платеж при оформлении кредита на 36 месяцев составит: ");
        System.out.println(service.calculate(amount, percent, months = 36) + " руб.");

    }

}
