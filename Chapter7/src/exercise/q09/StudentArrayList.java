package exercise.q09;

import java.util.List;
import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1001, "이철수"));
        students.add(new Student(1002, "김철수"));
        students.add(new Student(1003, "박철수"));

        for (int i = 0; i < students.size(); i++) {
            students.get(i).showStudentInfo();
        }

        System.out.println("===== for-each =====");
        
        for (Student student : students) {
            student.showStudentInfo();
        }
    }
}
