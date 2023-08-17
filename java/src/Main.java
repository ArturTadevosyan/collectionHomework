package src;

import src.model.Student;
import src.service.FileService;
import src.service.StudentService;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> read = FileService.read("test.txt");
        List<Student> students = StudentService.convert(read);
        Student maxMarkStudent = StudentService.maxMark(students);
        FileService.write("test.txt", "Max mark = " + maxMarkStudent.toString());
    }
}
