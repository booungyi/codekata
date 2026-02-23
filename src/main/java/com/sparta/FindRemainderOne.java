package com.sparta;

public class FindRemainderOne {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 1) {
                return 2;
            }
            answer = (n % i == 1) ? i : 0;
            if (answer == i) {
                return answer;
            }
        }
        return answer;
    }
}
