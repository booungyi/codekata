package com.sparta;

import java.util.Arrays;

public class ArrayAverage {
    public double solution(int[] numbers) {
        double answer = 0;

        answer = ((double)Arrays.stream(numbers).sum()) / numbers.length;
        return answer;
    }
}
