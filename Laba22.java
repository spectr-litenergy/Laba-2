public class Laba22 {
    public class LogSeries {
        public static void main(String[] args) {
            double x = 0.5; // можно поменять значение
            System.out.println("ln(1 - x) ≈ " + calculateLog( x ));
        }

        public static double calculateLog(double x) {
            if (x <= -1 || x >= 1) {
                System.out.println("x должно быть в диапазоне (-1, 1)");
                return Double.NaN;
            }
            double sum = 0;
            for (int n = 1; n <= 100; n++) {
                sum -= Math.pow(x, n) / n;
            }
            return sum;
        }
    }

}
