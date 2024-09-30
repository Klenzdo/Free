package org.example;

public class Fan {
    private String make;
    private String name;
    private String color;
    private int bladeNumber;


    public Fan(){
        this.make = "Century";
    }

    public String getMake(){
        return make;
    }

    public void setMake(){
        this.make = "make is Century";
    }
    private String makeValue(){
        return "";
    }

    public static void buyFan(double amount){
        System.out.println("this fan was sold for "+ amount);
    }


    public int calculateAreaOfCircle( int radius){
        double area = Math.PI*Math.pow(radius, radius);
         return (int) area;
    }

}
