package com.sparta;

import java.util.stream.LongStream;

public class IntervalNumberSeries {
    public long[] Solution(int x, int n) {
        return LongStream.iterate(x, value -> value + x).limit(n).toArray();
    }

}
