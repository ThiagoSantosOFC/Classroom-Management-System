package models;

import observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Observer {
    private final List<Lesson> lessons = new ArrayList<>();

    public Student(String name, int number) {
        super(name, number);
    }

    public void addLesson(Lesson lesson) {
        if (!lessons.contains(lesson)) {
            lessons.add(lesson);
            lesson.addStudent(this);
        }
    }

    public void removeLesson(Lesson lesson) {
        lessons.remove(lesson);
        lesson.removeStudent(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + getName() + " received update: " + message);
    }
}
