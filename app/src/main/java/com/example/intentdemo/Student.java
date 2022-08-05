package com.example.intentdemo;

public class Student {
    int rollNo;
    String name;
    double fee;

    public Student() {
    }

    public Student(int rollNo, String name, double fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", fee=" + fee +
                '}';
    }
}
