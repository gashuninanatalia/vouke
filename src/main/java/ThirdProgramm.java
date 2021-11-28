public class ThirdProgramm {

    public static void main(String[] args) {
        long multi = multiplication(13, 5);
        System.out.println("Умножение чисел 13 и 5 = " + multi);

        double div = division(36, 6);
        System.out.println("Деление чисел 36 и 6 = " + div);
    }

    private static long multiplication(int i, int i1) {
        return (long) i * i1;
    }

    private static double division(int i, int i1) {
        return i / i1;
    }
}


