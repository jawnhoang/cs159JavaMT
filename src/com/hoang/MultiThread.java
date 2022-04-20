package com.hoang;

import java.util.concurrent.ForkJoinPool;

public class MultiThread {

    public static void main(String[] args) {

//        int num_procs = Runtime.getRuntime().availableProcessors();
//        System.out.println("There are "+ num_procs + " procsessors available.\n");
        System.out.println("Filling 2D array on 1 process");
        int[][] arr = new int[10000][10000];
        int min = 0;
        int max = 99999;
        long startTime = System.nanoTime();
        FillArray.fill(arr, max, min);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Fill Array time: " + duration/1000000 + " milliseconds.\n");


        System.out.println("Creating sub process...\n");
        ForkJoinPool new_proc = new ForkJoinPool();
        FillArray task = new FillArray(arr, max, min);

        //creating a new process

//        //create 5 threads one 1 process
//        for(int i = 0; i < 5; i++){
//            MTusingThread thread_obj = new MTusingThread();    //creates new thread object
//            thread_obj.start();                                //start thread
//        }
//
//        for(int j = 0; j < 5; j++){
//            Thread runnable_obj = new Thread(new MTusingRunnable());
//            runnable_obj.start();
//        }

    }
}
