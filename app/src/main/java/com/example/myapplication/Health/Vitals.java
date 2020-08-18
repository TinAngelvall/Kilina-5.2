package com.example.myapplication.Health;

public class Vitals {
    private int weight;
    private int steps;

    public Vitals(int weight, int steps) {
        this.weight = weight;
        this.steps = steps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "VitalsList{" +
                "weight=" + weight +
                ", steps=" + steps +
                '}';
    }
}
