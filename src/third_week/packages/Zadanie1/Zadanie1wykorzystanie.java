package third_week.packages.Zadanie1;

import third_week.packages.Zadanie1.zadanie1;

import java.util.Scanner;

public class Zadanie1wykorzystanie {
    public static void main(String[] args) {
        new zadanie1();

        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String a = skaner.next();
        System.out.print("Podaj nazwisko: ");
        String b = skaner.next();

        System.out.println(zadanie1.imie(a,b));
    }
}
