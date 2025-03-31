package com.bridgelabz.annotation.beginner.todoannotation;

public class Project {

    @Todo(task = "Test current application" ,  assignedTo = "Tester" , priority = "HIGH")
   public void taskOne(){
        System.out.println("These is task one");
   }

   @Todo(task = "Develop application" , assignedTo = "Developer" , priority = "MEDIUM")
   public void taskTwo(){
    System.out.println("These is task two");
   }

   public void taskThree(){
    System.out.println("These is task three");
   }
}