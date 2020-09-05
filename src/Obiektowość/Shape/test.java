package Obiektowość.Shape;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape("czerwony",true);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        System.out.println("podaj dl boku kwadratu");
        double side = scanner.nextDouble();
        Square square = new Square(side);

        System.out.println(shape.toString());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
    }
}
