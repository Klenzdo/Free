package org.example;

public class Phone {
    private String make;
    private String name;
    private String model;
    private String osVersion;
    private String color;


    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String savePhone(Phone phone){
        return phone + "saved";
    }
}
