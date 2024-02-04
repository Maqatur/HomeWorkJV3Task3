public class CreditPaymentService {
    public int calculate(int amount, double percent, int months) {
        double i = percent / 12 /100;
        double i1 = 1 + i;
        double a = Math.pow(i1, months);
        double b = a - 1;
        double annuityRate = i * a / b;
        double monthlyPayment = amount * annuityRate;

        return (int)monthlyPayment;

    }
}
