/*
 * Daniel Davani-Davari  
 * Student ID: 991502775
 * SYST10199 - Web Programming
 */
package week2;

/**
 * Branch change.
 * @author Daniel
 */
public class Student {

    private String name;
    private int age;
    private int sid;
    private int maxCourse;

    public int getMaxCourse() {
        return maxCourse;
    }

    public void setMaxCourse(int maxCourse) {
        this.maxCourse = maxCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    Student(String name,
            int age,
            int sid) {

        this.name = name;
        this.age = age;
        this.sid = sid;
    }

}
