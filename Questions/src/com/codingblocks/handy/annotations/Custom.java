package com.codingblocks.handy.annotations;

import java.lang.annotation.*;

// Meta Annotations
@Inherited
@Documented
@Target({ElementType.TYPE, ElementType.LOCAL_VARIABLE})           // Level on which we will be using the annotation
@Retention(RetentionPolicy.RUNTIME) // Till what point do you want this annotation

@interface SmartPhone {
    String os() default "Symbian";
    int version() default 1;
}

@SmartPhone(os = "Android", version = 6)
class NokiaASeries{
    String model;
    int size;

    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}

// This is why we did @Inherited
class NAseries extends NokiaASeries{

    public NAseries(String model, int size) {
        super(model, size);
    }
}

public class Custom {

    public static void main(String[] args) {

        NokiaASeries obj = new NokiaASeries("Fire", 5);

        Class c = obj.getClass();
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone) an;

        System.out.println(s.os());
        System.out.println(s.version());

    }

}
