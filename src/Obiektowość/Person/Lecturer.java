package Obiektowość.Person;

import java.math.BigDecimal;

public class Lecturer extends Person{
    private String specialization;
    private BigDecimal salary;

    public Lecturer(String specjalization,BigDecimal salary){
        this.specialization=specjalization;
        this.salary=salary;
    }

    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(){
        this.specialization = specialization;
    }
    public BigDecimal getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary=salary;
    }

    @Override
    public String toString(){
        return specialization +"->"+ salary;
    }



}
