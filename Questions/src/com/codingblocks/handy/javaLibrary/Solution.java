package com.codingblocks.handy.javaLibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    public static Comparator<Student> comparator = (e1, e2) -> (int)(e1.getCgpa() - e2.getCgpa());

}

//Complete the code
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        ArrayList<Student> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Student[] array = (Student[]) studentList.toArray();

        Arrays.sort(array, Student.comparator);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}



