package com.sparta;

public class HarshadNumberChecker {
    public boolean solution(int n) {
        int sum = 0;
        int tamp = n;
        while (tamp > 0) {
            sum += tamp % 10;
            tamp /= 10;
        }
        return n % sum == 0;
    }
}
