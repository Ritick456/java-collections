package com.bridgelabz.reflection.intermediate.retrieveannotationatruntime;

import java.awt.print.Book;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        
        Class<Books> bookClass = Books.class;

        if(bookClass.isAnnotationPresent(Author.class)){

            Author author = bookClass.getAnnotation(Author.class);
            System.out.println("Author name " + author.name());
        }
        else{
            System.out.println("The class is not annotated");
        }
    }
}
