package com.company;

public final class Son extends Dad{
    public String getStudyIn() {
        return StudyIn;
    }

    private String StudyIn;

    public Son(String name,int age, int height, int weight, com.company.LivesIn livesIn, Job job, String studyIn) {
        super(name,age, height, weight, livesIn,job);
        StudyIn = studyIn;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nStudyIn: " + StudyIn;
    }
}

