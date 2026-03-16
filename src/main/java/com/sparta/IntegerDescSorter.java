package com.sparta;

import java.util.Arrays;
import java.util.Collections;

public class IntegerDescSorter {
    public long solution(long n) {

        String[] answer = String.valueOf(n).split("");

        Arrays.sort(answer, Collections.reverseOrder());


        StringBuilder sb = new StringBuilder();
        for (String s : answer) {
            sb.append(s);
        }
        return Long.parseLong(sb.toString());
    }

}
