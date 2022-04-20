package com.hoang;

public class MTusingThread extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Running Thread : " + Thread.currentThread().getId() + " from Thread");
        }catch (Exception e){
            System.out.println("Error Caught");
        }
    }
}
