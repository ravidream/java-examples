package com.example.programs;

public class MillisecondsEx {
public static void main(String args[])
    
    {
        long milliseconds = 1000000;
        
        //long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
        
        long minutes=(milliseconds/1000)/60;
        
        //long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
        
        long seconds=(milliseconds/1000);
        
        System.out.format("%d Milliseconds = %d minutes\n" ,milliseconds,minutes);
        System.out.println("Or");
        System.out.format("%d Milliseconds = %d seconds" ,milliseconds,seconds);
    }

}
