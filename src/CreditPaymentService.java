public class CreditPaymentService {//

    public double calculate(int amount, double percentPerYear, int year) {
        double monthlyPayment;//вводим переменную для вывода результата данного метода
        double percentPerMonth = percentPerYear / 100 / 12; //вводим переменную которая считает процент в месяц
        double month = year * 12; //вводим переменную которая переводит года в месяцы, значение равно числу платежей
        double a = 1 + percentPerMonth;// вводим переменную для подсчёта Math.pow(1 + percentPerMonth)
        double annuityCoefficient = percentPerMonth * Math.pow(a, month) / (Math.pow(a, month) - 1);
        // переменная считает коэффициент аннуитета
        monthlyPayment = amount * annuityCoefficient;// считаем месячный платёж
        return monthlyPayment;
    }
}
