package com.SetterGetter;

public class AllEmployee {

    private Employee faizan = new Employee();
    private Employee aman = new Employee();

    public void setFaizan(Employee faizan){
        this.faizan = faizan;
    }
    public Employee getFaizan(){
        return faizan;
    }
    public void setAman(Employee aman){
        this.aman = aman;
    }
    public Employee getAman(){
        return aman;
    }

}
