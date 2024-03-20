/*
 * @Date: 2024-03-07 15:33:33
 * @LastEditors: liqunwu wlqsmiling@gmail.com
 * @LastEditTime: 2024-03-07 15:33:40
 * @FilePath: \demo\src\main\java\com\test\demo\Model\Student.java
 */
package com.test.demo.Model;

public class Student {
    public String name;
    public int age;
    public Student(){}
    public Student(String name,int age){
        this.name=name;
        this.age=age;
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
 
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}