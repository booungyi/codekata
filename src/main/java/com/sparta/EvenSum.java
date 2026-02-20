package com.sparta;

import java.util.stream.IntStream;

public class EvenSum {
    public int Solution(int n) {
        return IntStream.rangeClosed(0, n)
                .filter(e -> e % 2 == 0)
                .sum();
    }
}
