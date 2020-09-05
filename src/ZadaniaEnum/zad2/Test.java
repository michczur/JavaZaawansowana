package ZadaniaEnum.zad2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wymiar min paczki");
        int min = scanner.nextInt();
        System.out.println("podaj wymiar max paczki");
        int max = scanner.nextInt();
        System.out.println(PackageSize.getPackageSize(min, max));
        // Czemu zawsze daje mi CUSTOM ???
    }
}
