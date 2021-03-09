package third_week.packages.Zadanie1;

import java.util.Scanner;

public class zadanie7 {
    public static class Piecznie{
        protected int wymagane = 60;
        protected int czas = wymagane;

        public void dodaj(){
            int dodac = wymagane - czas;
            dodaj(dodac);
        }
        public void dodaj(int dodac){
            if (dodac + czas > wymagane){
                System.out.println("Nie mogę dodać " + dodac + " minut");
            }
            else {
                czas += dodac;
                System.out.println("Dodałem " + dodac + " minut");
            }
        }

        public static void main(String[] args) {
            Piecznie piecznie = new Piecznie();
            System.out.println("Czas: " + piecznie.czas);
            System.out.println("Wymagany czas: " + piecznie.wymagane);
            piecznie.dodaj();

            Scanner skaner = new Scanner(System.in);
            System.out.print("Ile czasu dodać? ");
            int dodac = skaner.nextInt();
            piecznie.dodaj(dodac);
        }
    }
}
