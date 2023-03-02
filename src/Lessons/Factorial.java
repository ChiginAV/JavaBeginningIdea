package Lessons;

public class Factorial {

    // Recursive method
    public int factR(int n){
        int result;

        if (n == 1) return 1;

        result = factR(n-1) * n;
        return result;
    }

    // Iteration method
    public int factI(int n){
        int result = 1;

        for (int t = 1; t <= n; t++) result *= t;

        return result;
    }

}
