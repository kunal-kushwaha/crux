package com.codingblocks;

public class Main {


    public static void main(String[] args) {

        Teacher teacher = new JavaTeacher();
        System.out.println(teacher.temper);
        teacher.teach();
        teacher.study();
        ((JavaTeacher) teacher).dance();

        Teacher t = new TeachingAssistant();
        t.study();
        Student s = new TeachingAssistant();
        s.study();
        TeachingAssistant ta = new TeachingAssistant();
        ta.study();
        ta.teach();
        // This doesn't provide abstraction because all methods of Teacher will be available to TeachingAssistant
        // An interface reference variable has knowledge only of the methods declared by its interface declaration
        // i.e. Teacher teacher = new JavaTeacher(); teacher does not know about any other members of class JavaTeacher
    }
}
