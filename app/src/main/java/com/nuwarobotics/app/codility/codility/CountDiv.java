package com.nuwarobotics.app.codility.codility;

/**
 * Created by Mickey on 2018/5/9.
 */

public class CountDiv {
    public static int solution(int A, int B, int K) {
        // 找出範圍A~B間，K的倍數有幾個
        int answer = B/K - A/K;
        if(A%K == 0) answer += 1;
        return answer;
    }
}
