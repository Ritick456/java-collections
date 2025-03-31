package com.bridgelabz.annotation.intermediate.logexecutiontime;

public class TaskProcessor {
    
    @LogExecutionTime()
    public void fastTask(){
                System.out.println("Fast Task");
    }

    @LogExecutionTime()
    public void slowTask(){
        
        for(int i=0; i<1000000; i++){
            i++;
        }
        System.out.println("Slow Executing task");
    }


}
