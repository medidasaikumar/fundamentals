package com.codegnan.www;

import java.util.Scanner;
public class studentDetails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student name");
        String name=sc.nextLine();
        System.out.println("Enter the Student Rollno");
        int rollno = sc.nextInt();
        System.out.println("Enter the Student Age");
        int Age = sc.nextInt();
        System.out.println("Enter the Student Grade");
        String Grade =sc.next();
        System.out.println("student name :" +name);
        System.out.println("rollno :" +rollno);
        System.out.println("Age :" +Age);
        System.out.println("Grade :" +Grade);
    }
}
