public class Calculater {
    public double calculate(int summa, int period, double percent) {

        int month = 12 * period;
        double percenntMonth = percent / 100 / 12;
        double fraction = 1 + percenntMonth;
        double fraction2 = Math.pow(fraction, month);
        double fraction3 = fraction2 - 1;
        double fraction4 = percenntMonth / fraction3;
        double fraction5 = percenntMonth + fraction4;
        double payment = summa * fraction5;
         return payment;
    }
}
