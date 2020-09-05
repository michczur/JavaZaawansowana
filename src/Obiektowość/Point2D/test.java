package Obiektowość.Point2D;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D(2, 5, 7);

        System.out.println("podaj x do punktu w dwoch wymiarach");
        point2D.setX(scanner.nextInt());

        System.out.println("podaj y do punktu w dwoch wymiarach");
        point2D.setY(scanner.nextInt());

        for (float i : point2D.getXY()) {
            System.out.println(i);
        }


        for (float i : point3D.getXYZ()) {
            System.out.println(i);
        }

        System.out.println(point3D.toString());

    }
}
