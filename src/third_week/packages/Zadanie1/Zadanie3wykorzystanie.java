package third_week.packages.Zadanie1;

import third_week.packages.Zadanie1.*;

import java.util.Scanner;

public class Zadanie3wykorzystanie extends zadanie3{
    public static void main(String[] args) {
        Zadanie3wykorzystanie list = new Zadanie3wykorzystanie();

        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe 1: ");
        int a = skaner.nextInt();
        System.out.print("Podaj liczbe 2: ");
        int b = skaner.nextInt();

        System.out.print(list.mnozenie(a,b));
    }
}
