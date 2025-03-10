import models.Professor;
import models.Student;
import models.Lesson;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Marco Ferreira", 1);
        Professor professor2 = new Professor("Joao Ramos", 2);
        Professor professor3 = new Professor("Sonia Luz", 3);

        Lesson lesson1 = new Lesson("Programming 2 PL1", 1);
        Lesson lesson2 = new Lesson("Programming 2 PL2", 2);

        Student student1 = new Student("José António", 2190354);
        Student student2 = new Student("Carlos Santos", 2191187);

        // Assign professor1 to lessons
        lesson1.setProfessor(professor1);
        lesson2.setProfessor(professor1);
        lesson2.setProfessor(professor1); // No duplicate assignment
        lesson2.setProfessor(professor2); // professor1 is removed
        lesson2.removeProfessor();

        // Add students to lessons
        lesson1.addStudent(student1);
        student1.addLesson(lesson1);
        student2.addLesson(lesson1);

        // Remove students
        lesson1.removeStudent(student1);
        student1.removeLesson(lesson1);

        // Professor fills lesson summary
        professor1.fillSummary(lesson1, "Introduction to OOP");
        professor2.fillSummary(lesson2, "SOLID Principles");

        // Display summaries
        System.out.println(lesson1.getSummary());

        // Create lesson with predefined students
        List<Student> studentList = new LinkedList<>();
        studentList.add(student1);
        studentList.add(student2);

        Lesson lesson3 = new Lesson("Programming 2 PL3", 3, professor3, studentList);
        professor3.fillSummary(lesson3, "Design Patterns");

        System.out.println(lesson3.getSummary());
    }
}
