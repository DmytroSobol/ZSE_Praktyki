package third_week.packages.Zadanie;

import third_week.packages.*;

import java.util.Scanner;

public class Zadanie2wykorzystanie {
    public static void main(String[] args) {
        zadanie2 list = new zadanie2();

        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj kraj: ");
        String a = skaner.next();
        System.out.print("Podaj miasto: ");
        String b = skaner.next();

        System.out.println(list.miasto(a,b));
    }
}
