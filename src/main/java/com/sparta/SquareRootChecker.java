package com.sparta;

public class SquareRootChecker {
    public double solution(long n) {
        double answer = Math.sqrt(n);
        return answer %1==0 ?Math.pow(answer+1,2) : -1;
    }
}
