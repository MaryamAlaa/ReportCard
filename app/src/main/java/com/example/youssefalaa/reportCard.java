package com.example.youssefalaa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by youssef alaa on 12/04/2017.
 */
public class reportCard {

    private String studentName;
    private List<Integer> grades;
    private int Year;


    public reportCard(String sName, int date) {
        studentName = sName;
        this.grades = new ArrayList<>();
        Year = date;
    }

    public String getSName() {
        return studentName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }


    public int getYear() {
        return Year;
    }

    public float average() {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum = sum + grades.get(i);
        }
        float Average = sum / grades.size();
        return Average;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                ", studentName='" + getSName() + '\'' +
                ", Average='" + average() + '\'' +
                ", year=" + getYear() +
                '}';
    }
}
