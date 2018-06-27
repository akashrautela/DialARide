package com.dialaride.utilities;

public class Car {
    private int carTime;
    private int capacity;
    private int location;
    private int revaneu;

    public int getCarTime() {
        return carTime;
    }

    public void setCarTime(int carTime) {
        this.carTime = carTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getRevaneu() {
        return revaneu;
    }

    public void setRevaneu(int revaneu) {
        this.revaneu = revaneu;
    }

    public int[] getPassengerlocation() {
        return passengerlocation;
    }

    public void setPassengerlocation(int[] passengerloacation) {
        this.passengerlocation = passengerloacation;
    }

    private int[]passengerlocation;
    public void passengerLocationReset(){
        for(int i=0;i<10;i++)
            passengerlocation[i]=0;
    }

    public Car(){
        capacity=5;
        passengerlocation=new int[5];
    }







}
