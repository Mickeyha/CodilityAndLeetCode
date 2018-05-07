package com.nuwarobotics.app.codility.codility;

/**
 * Created by Mikihaha on 2018/5/3.
 */

public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        long answer = 0;
        if(Y == X) return 0;
        long tmp = (Y-X);
        answer = tmp/D;
        if(tmp % D != 0)
            answer += 1;

        return (int)answer;
    }
}
