package com.sparta;
public class DigitReverser {
    public long[] solution(long n) {
        int length = String.valueOf(n).length();
        long[] answer = {};
        int i = 0;
        while (n > 0) {
            answer[i] = n % 10;
            n /= 10;
            i++;
        }
        return answer;
    }
}
