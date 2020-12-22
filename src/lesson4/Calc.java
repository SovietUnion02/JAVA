package lesson4;

public class Calc {

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Minus(int a, int b) {
        return a - b;
    }

    public static int Mult(int a, int b) {
        return a * b;
    }

    public static int Division(int a, int b) {
        return a / b;
    }

    public static int Pow(int a, int b) {
        int res = a;

        for (int i = 2; i <= b; i++) {
            res = res * a;
        }
        return res;
    }

    public static int Fact(int a) {
        int res = a;

        for (int i = 2; i < a; i++) {
            res = i * (i + 1);
        }

        return res;
    }
}
