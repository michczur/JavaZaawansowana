package Obiektowość.Person;

import java.math.BigDecimal;

public class test {
    public static void main(String[] args) {

        Student osoba1 = new Student("informatyka", 3, BigDecimal.valueOf(2354.32));
        System.out.println(osoba1.toString());

        Lecturer wykladowca = new Lecturer("telogia", BigDecimal.valueOf(214455.53));
        System.out.println(wykladowca.toString());

    }
}
