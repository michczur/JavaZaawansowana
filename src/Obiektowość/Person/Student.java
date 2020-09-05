package Obiektowość.Person;

import java.math.BigDecimal;

public class Student extends Person {
    private String typeOfStudies;
    private int yearOfStudies;
    private BigDecimal costOfStudies;

    public Student(String typeOfStudies, int yearOfStudies, BigDecimal costOfStudies) {
        this.typeOfStudies = typeOfStudies;
        this.yearOfStudies = yearOfStudies;
        this.costOfStudies = costOfStudies;
    }

    public String getTypeOfStudies() {
        return typeOfStudies;
    }

    public void setTypeOfStudies(String typeOfStudies) {
        this.typeOfStudies = typeOfStudies;
    }

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public BigDecimal getCostOfStudies() {
        return costOfStudies;
    }

    public void setCostOfStudies(BigDecimal costOfStudies) {
        this.costOfStudies = costOfStudies;
    }

    @Override
    public String toString() {
        return typeOfStudies + "->" + yearOfStudies + "->" + costOfStudies;
    }
}
