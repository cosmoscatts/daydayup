package com.duende.leetcode.code.day_2022_07_15;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test01 {

}

class MovingAverage {
    Queue<Integer> queue;
    int size;
    double sum;

    public MovingAverage(int size) {
        queue = new ArrayDeque<Integer>();
        this.size = size;
        sum = 0;
    }

    public double next(int val) {
        if (queue.size() == size) {
            sum -= queue.poll();
        }
        queue.offer(val);
        sum += val;
        return sum / queue.size();
    }
}
