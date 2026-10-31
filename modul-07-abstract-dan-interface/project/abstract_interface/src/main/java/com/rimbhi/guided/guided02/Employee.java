package com.rimbhi.guided.guided02;

public abstract class Employee implements Payable{
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // setiap pegawai pasti punya gaji, tetapi dengan rumus yang berbeda-beda. 
    public abstract double earnings();

    // saat ada penagihan, alihkan langsung ke metode kalkulasi gaji (earning)
    @Override 
    public double getPaymentAmount(){
        return earnings();
    }
}
