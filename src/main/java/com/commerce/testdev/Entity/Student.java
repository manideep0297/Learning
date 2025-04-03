package com.commerce.testdev.Entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    private int age;

    @ManyToMany
    @JoinTable(
            name="students_courses",
            joinColumns = @JoinColumn(name="student_id"),
            inverseJoinColumns = @JoinColumn(name="course_id")
    )
    private List<Course> courseList;
}
/*
your task -

how many type of GeneratedValues are present?

diffence between jpa and crud repository and if other repostries are present

@Transacation other annotation majorly we use...

how to use post? -> what are methods we have / different stages of db in spring(persist, update)

@Pangination -

s - c
1   m
m   1
=====
m   m

students
id name      age
1  anirudh    27
courses
id name
1  java
2  C
3  python


new table for mapping
 coursed_id  students_id
     1          1
     2          1
     1          2
     2          2
 */