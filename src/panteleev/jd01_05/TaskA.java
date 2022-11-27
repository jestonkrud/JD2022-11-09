package panteleev.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {

        exercise1();
        exercise2();
    }

    private static void exercise1() {

        final double a = 756.13;
        final double x = 0.3;

        double firstNumber = cos(pow(pow(x, 2) + PI / 6, 5));
        double secondNumber = sqrt(x * pow(a, 3));
        double thirdNumber = log(abs((a - 1.12 * x) / 4));
        double z = firstNumber - secondNumber - thirdNumber;

        System.out.println(z);
    }

    private static void exercise2() {

        final double a = 1.21;
        final double b = 0.371;

        double firstNumber = tan(pow(a+b, 2));
        double secondNumber = pow(a+1.5, 1.0/3);
        double thirdNumber = a * pow(b, 5);
        double fourthNumber = b / log(pow(a, 2));
        double y = firstNumber - secondNumber + thirdNumber - fourthNumber;

        System.out.println(y);
    }
}
