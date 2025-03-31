package com.bridgelabz.annotation.beginner.markimportantmethod;

//package com.bridgelabz.Annotation.beginner.markimportantmethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface MarkImportantMethod {
    String level() default "high";
}
