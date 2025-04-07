// package src.sreelakshmiTrainer.final_keyword;
package final_keyword;

import java.util.ArrayList;

public class StudentManager {
    public static void main(String[] args) {

        final ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Alice"));
        students.add(new Student(102, "Bob"));
        students.add(new Student(103, "Charlie"));

        System.out.println("Student List:");
        for (Student s : students) {
            s.displayStudent();
        }

        students.add(new Student(104, "David"));
        students.remove(1);

        // Display updated student list
        System.out.println("\nUpdated Student List:");
        for (Student s : students) {
            s.displayStudent();
        }
    }

}
