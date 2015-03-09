package com.lr.racing;

public class Car {
    int position;
    int n2o;
    int speed;
    String name;
    
        
    public void move() {
        position += speed;
        if((Math.random()*100)>60){
            position += speed + n2o;
        }
        else {
            position += speed;
        }
    }
    public Car(String name) {
        n2o = 20;
        speed = 50;
        position = 0;
        this.name = name;
        
    }

    public String toString(){
        return "Car with speed : " + speed + " n2o " + n2o + " name " + name;
    }
}

