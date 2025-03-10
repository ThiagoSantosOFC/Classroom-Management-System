package models;

import observer.Subject;
import java.util.ArrayList;
import java.util.List;

public class Lesson extends Subject {
    private final String name;
    private final int number;
    private String summary;
    private Professor professor;
    private final List<Student> students = new ArrayList<>();

    public Lesson(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Lesson(String name, int number, Professor professor, List<Student> students) {
        this.name = name;
        this.number = number;
        this.professor = professor;
        this.students.addAll(students);
        for (Student student : students) {
            addObserver(student);
        }
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setProfessor(Professor professor) {
        if (this.professor != null) {
            this.professor.removeLesson(this);
        }
        this.professor = professor;
        professor.addLesson(this);
    }

    public void removeProfessor() {
        if (professor != null) {
            professor.removeLesson(this);
            professor = null;
        }
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            addObserver(student);
        }
    }

    public void removeStudent(Student student) {
        students.remove(student);
        removeObserver(student);
    }

    public void setSummary(String summary) {
        this.summary = summary;
        notifyObservers("New summary available for lesson: " + name);
    }

    public String getSummary() {
        return summary;
    }
}
