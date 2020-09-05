package Obiektowość.Line;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("elo melo");
        Scanner scanner = new Scanner(System.in);
        Line line = new Line(4.0f,4.0f,8.0f,8.0f);
        System.out.println(line.getPunktPoczatkowy());
        System.out.println(line.getPunktKoncowy());
        System.out.println(line.jakDluga(line.getPunktPoczatkowy(),line.getPunktKoncowy()));
        System.out.println(line.srodek(line.jakDluga(line.getPunktPoczatkowy(),line.getPunktKoncowy())));
    }
}
