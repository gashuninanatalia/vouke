public class SecondProgram {

        public static void main(String[] args) {
            System.out.println("Привет, Мир!");
            int summa = calculate(13, 15);
            System.out.println(summa);
        }
            public static int calculate(int arg1, int arg2)  {
                int result = arg1 + arg2;
                return result;
            }
}
