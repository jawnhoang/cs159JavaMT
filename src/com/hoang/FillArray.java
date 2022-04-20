package com.hoang;

import java.util.concurrent.RecursiveAction;

public class FillArray extends RecursiveAction {
     int[][] arr = new int[10000][10000];
     int min = 0;
     int max = 99999;


    /**
     * The main computation performed by this task.
     */
    @Override
    protected void compute() {
        fill(arr, max, min);

    }

    public static void fill(int[][] arr, int max, int min) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
                arr[i][j] = random_int;
            }
        }
    }
}
