package com.hoang;

public class MTusingRunnable implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("Running Thread: " + Thread.currentThread().getId()+ " from Runnable");
        }catch(Exception e){
            System.out.println("Error caught");
        }
    }
}
