public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double percentPerYear = 9.99;
        int year = 3;
        double monthlyPayment = service.calculate(amount, percentPerYear, year);
        int roundingNumber = (int) monthlyPayment; //преобразование месячного платежа в int
        System.out.println("ежемесячный платёж" + roundingNumber);
    }
}