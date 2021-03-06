package com.example.mypersonaltrainer.ObjectClasses;

import java.util.ArrayList;
import java.util.List;

public class Workout
{
    private String title;
    private ArrayList<Exercise> exercises;
    public Workout()
    {
        exercises = new ArrayList<Exercise>();
    }

    public Workout(ArrayList<Exercise> exercises, String title){
        this.exercises = exercises;
        this.title = title;
    }


    public void addExercise(Exercise e)
    {
        exercises.add(e);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList getWorkout()
    {
        return exercises;
    }

    public String toString(){
        String result = title + "\n";
        for(Exercise e: exercises)
            result += e.toString() + "\n";

        result += "\n";
        return result;
    }



}
