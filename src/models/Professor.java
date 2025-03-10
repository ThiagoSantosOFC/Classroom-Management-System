package models;

import observer.Observer;
import observer.Subject;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {
    private final List<Lesson> lessons = new ArrayList<>();

    public Professor(String name, int number) {
        super(name, number);
    }

    public void addLesson(Lesson lesson) {
        if (!lessons.contains(lesson)) {
            lessons.add(lesson);
        }
    }

    public void removeLesson(Lesson lesson) {
        lessons.remove(lesson);
    }

    public void fillSummary(Lesson lesson, String summary) {
        if (lessons.contains(lesson)) {
            lesson.setSummary(summary);
        }
    }
}
