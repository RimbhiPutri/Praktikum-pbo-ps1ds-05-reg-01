package com.rimbhi.guided.guided01;

public abstract class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // setiap pegawai pasti punya gaji, tetapi dengan rumus yang berbeda-beda. 
    public abstract double earnings();
}
