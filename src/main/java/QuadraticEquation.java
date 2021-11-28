public class QuadraticEquation {

    public static void main(String[] args) {
       // a * x^2 + b * x + c = 0
        int a = 1;
        int b = -4;
        int c = 4;
        calculateRoots(a, b, c);
    }

    private static void calculateRoots(int a, int b, int c) {
        // d = b^2 - 4*a*c
        int discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Корней квадратного уравнения с коэффициентами а = " + a
            + " b = " + b + "c = "  + c + " не может быть найдено, поскольку дискриминант = " + discriminant
            + " и является отрицательным числом");
        } else if (discriminant == 0) {
            int x = -b / (2 * a);
            System.out.println("Найден единственный корень квадратного уравнения с коэффициентами а = " + a
                    + " b = " + b + "c = "  + c + " и он равен " + x);
        } else { // discriminant > 0
            int x1 = (int) (-b + Math.sqrt(discriminant)) / (2 * a);
            int x2 = (int) (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Найдены корни квадратного уравнения с коэффициентами а = " + a
                    + " b = " + b + "c = "  + c + " и они равны " + x1 + " и " + x2);
        }
    }
}
