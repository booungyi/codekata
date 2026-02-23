package com.sparta;

import java.util.Arrays;

public class MeanCalculator {
    public double solution(int[] arr) {
        return Arrays.stream(arr).sum() / (double) arr.length;
    }
}
