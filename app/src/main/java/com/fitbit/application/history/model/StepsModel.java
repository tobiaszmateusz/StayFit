package com.fitbit.application.history.model;

public class StepsModel {

    String date;
    int value;
    String hours;
    int distance;

    public StepsModel(String date, int value, int distance, String hours) {
        this.date = date;
        this.value = value;
        this.hours = hours;
        this.distance = distance;
    }

    public String getDate() {
        return date;
    }

    public int getValue() {
        return value;
    }

    public int getDistance() { return distance; }

    public String getHours() { return hours; }

}
