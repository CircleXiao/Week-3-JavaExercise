package model;

public class Student {
    private String name;
    private int age;
    private String sex;
    private int studentID;

    public Student (String name, int age, String sex, int studentID) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }  
}