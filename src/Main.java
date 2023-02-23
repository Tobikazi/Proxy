public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(11, 24));
        System.out.println(calc.mult(23, 11));
        System.out.println(calc.pow(16, 2));
    }
}