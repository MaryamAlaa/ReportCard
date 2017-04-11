package com.example.youssefalaa.reportcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by youssef alaa on 11/04/2017.
 */

public class ReportCard {

    private String StudentName;
    private List<Integer> grades;
    private int Year;


    public ReportCard(String sName,int year) {
        StudentName = sName;
        this.grades = new ArrayList<>();
         Year = year;
    }

    public String getSName() {
        return StudentName;
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
    public float Average() {

        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum = sum + grades.get(i);
        }
        float average = sum / grades.size();
        return average;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                ", studentName='" + getSName() + '\'' +
                ", Average='" + Average() + '\'' +
                ", year=" + getYear() +
                '}';
    }
}
