package org.koreait;

public class Main {
    public static void main(String[] args) {
        int x = 10;

        for (int i = 0; i < x; i++) {
            System.out.print(Fibonacci(i) + " ");
        }

    }
    public static int Fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}