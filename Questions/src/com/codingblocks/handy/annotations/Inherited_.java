package com.codingblocks.handy.annotations;


import java.lang.annotation.Inherited;

@Inherited
@interface MyAnnotation {

}

@MyAnnotation
class MySuperClass {

}

class MySubClass extends MySuperClass {

}

// In this example the class MySubClass inherits the annotation @MyAnnotation because MySubClass inherits from
// MySuperClass, and MySuperClass has a @MyAnnotation annotation.

public class Inherited_ {
    
}
