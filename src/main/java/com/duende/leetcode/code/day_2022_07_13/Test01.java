package com.duende.leetcode.code.day_2022_07_13;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test01 {
    // 7/13 日打卡
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int t : asteroids) {
            boolean ok = true;
            while (ok && !dq.isEmpty() && dq.peekLast() > 0 && t < 0) {
                int a = dq.peekLast(), b = -t;
                if (a <= b)
                    dq.pollLast();
                if (a >= b)
                    ok = false;
            }
            if (ok)
                dq.addLast(t);
        }
        int size = dq.size();
        int[] ans = new int[size];
        while (!dq.isEmpty())
            ans[--size] = dq.pollLast();
        return ans;
    }
}
