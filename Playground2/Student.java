package com.ultralesson.javaPlayground;

public class Student {
    String name;
    public Student(){
        this.name = "Unknown";
        System.out.println(this.name);
    }
    public Student(String input_name){
        this.name = input_name;
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Student ob1 = new Student("Hikaru Nakamura");
        Student ob2 = new Student();
    }
}
