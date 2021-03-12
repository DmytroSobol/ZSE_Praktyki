package third_week.exceptions;

import java.util.Scanner;

public class WyjatkiZajecia {

    public static void isNotNegative(int a, int b) throws Exception{
        if (b < 0 ){
            throw new Exception()''
        }
    }

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        try {
            System.out.print("Podaj liczbe A: ");
            int A = skaner.nextInt();
            System.out.print("Podaj liczbe B: ");
            int B = skaner.nextInt();
            System.out.println("liczba A: " + A + "\t Liczba B: " + B);

            isNotNegative(A,B);

            System.out.print(A/B);

        } catch (Exception exception) {
            System.out.println("Wyskoczył błąd, spróbuj ponownie");
        }

        System.out.println("Koniec programu");
    }
}
