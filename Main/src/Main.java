public class Main {
    public static void main(String[] args) {

        Calculater run = new Calculater();
        double resulttwelve= run.calculate(1_000_000, 1, 9.99);
        System.out.println (" сумма кредита 1 000 000 руб., срок - 1год. ");
        System.out.println (" ежемесячный платеж = " + resulttwelve + " руб ");

        double resulttwentyFour= run.calculate(1_000_000, 2, 9.99);
        System.out.println (" сумма кредита 1 000 000 руб., срок - 2года. ");
        System.out.println (" ежемесячный платеж = " + resulttwentyFour + " руб ");

        double resultthirtySix= run.calculate(1_000_000, 3, 9.99);
        System.out.println (" сумма кредита 1 000 000 руб., срок - 3года. ");
        System.out.println (" ежемесячный платеж = " + resultthirtySix + " руб ");
    }
}
