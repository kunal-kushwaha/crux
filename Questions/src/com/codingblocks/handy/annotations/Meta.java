package com.codingblocks.handy.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)

@interface MyAnnoT {
    String str();
    int val();
}

class Meta {
    // myMeth now has two arguments.
    @MyAnnoT(str = "Two Parameters", val = 19)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();
        try {
            Class c = ob.getClass();
            // OR
//            Class<?> c = Meta.class;

            // Here, the parameter types are specified.
            Method m = c.getMethod("myMeth", String.class, int.class);

            // Get all annotations
            Annotation[] annotations = c.getAnnotations();

            MyAnnoT anno = m.getAnnotation(MyAnnoT.class);
            //  This expression evaluates to a Class object of type MyAnnoT, the annotation.
            // This construct is called a class literal. You can use this type of expression whenever a Class object of
            // a known class is needed. For example, this statement could have been used to obtain the Class object for
            // Meta:    Class<?> c = Meta.class;

            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
    public static void main(String args[]) {
        myMeth("test", 10);
    }
}
