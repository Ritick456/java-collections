package com.bridgelabz.annotation.beginner.markimportantmethod;

public class TaskManager {
    
    @MarkImportantMethod(level = "Veryhigh")
    public void criticalTask(){
        System.out.println("These task is very critical");
    }

    @MarkImportantMethod(level = "moderate")
    public void moderateTask(){
        System.out.println("These task is very critical");
    }

    public void normalTask(){
        System.out.println("These task is very critical");
    }

}
