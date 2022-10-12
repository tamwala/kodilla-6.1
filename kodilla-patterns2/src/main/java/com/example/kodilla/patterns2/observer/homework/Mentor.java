package com.example.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(Student student) {
        System.out.println(getMentorName() + ": New task done by " + student.getStudentName() + "\n" +
                " (total: " + student.getTasks().size() + " tasks done)");
        updateCount++;
    }
}
