package ZadaniaEnum.zad1;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzien tygodnia");
        Weekday dzien = Weekday.valueOf(scanner.nextLine());
        System.out.println("czy jest to tydzien pracujacy:" + dzien.isWeekday(dzien));
        System.out.println("Czy jest wolne:" + dzien.isHoliday(dzien));
        Weekday.whichIsGreater(dzien);
    }

}
