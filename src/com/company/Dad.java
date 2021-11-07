package com.company;

public class Dad extends GrandP{
    private Job job;
    private String name;

    public String getName() {
        return name;
    }

    public Dad(String name,int age, int height, int weight, com.company.LivesIn livesIn, Job job) {
        super(age, height, weight, livesIn);
        this.job = job;
        this.name = name;
    }

    public Job getJob() {
        return job;
    }
    public String getInfo(){
        return  "\nName: "+ name + "\nAge: " + getAge() +  "\nHeight: " + getHeight()+ "\nWeight: " + getWeight()
                + "\nLivesIn: " + getLivesIn() + "\nJob: " + job.getNameOfJob();
    }

    public final String getInfo2() {
        return  "\nName: "+ name + "\nAge: " + getAge() +  "\nHeight: " + getHeight()+ "\nWeight: " + getWeight()
                + "\nLivesIn: " + getLivesIn();
     }
}

