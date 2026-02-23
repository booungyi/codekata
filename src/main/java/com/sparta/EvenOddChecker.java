package com.sparta;

public class EvenOddChecker {
    public String solution(int num) {
//        String answer = "Odd";
//        if (num % 2 == 0) {
//            answer = "Even";
//            return answer;
//        }
//        return answer;
        return (num %2 == 0) ? "Even" : "Odd";
    }
}
