package com.evaluacion.evaluacion;

public class Person {
  private  String Name="";
  private String FirstName="";

    public  Person(){
    Name= "Brandon";
    FirstName="Gonzalez";
    }

    public void pedirnombre(){
        System.out.println("");
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFirtName() {
        return FirtName;
    }

    public void setFirtName(String firtName) {
        FirtName = firtName;
    }
}
