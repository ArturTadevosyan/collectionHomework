package src.service;


import src.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentService {

    public static List<Student> convert(List<String> data) {
        List<Student> students = new ArrayList<>();
        for (String str : data) {
            students.add(new Student(str));
        }
        return students;
    }

    public static Student maxMark(List<Student> students) {
        return Collections.max(students);
    }

}
