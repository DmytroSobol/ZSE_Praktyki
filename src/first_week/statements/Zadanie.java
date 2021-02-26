package first_week.statements;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {

        // Zadanie 1
        System.out.println("\n Zadanie 1 \n");

        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = skaner.nextInt();

        if(liczba < 0){
            System.out.println("Liczba mniejsza od 0");
        }
        else{
            if(liczba == 0){
                System.out.println("Liczba jest równa 0");
            }
            else{
                System.out.println("Liczba większa od 0");
            }
        }


        //Zadanie 2
        System.out.println("\n Zadanie 2 \n");

        System.out.println("Podaj liczbe 1: ");
        int a = skaner.nextInt();
        System.out.println("Podaj liczbe 2: ");
        int b = skaner.nextInt();
        System.out.println("Podaj liczbe 3: ");
        int c = skaner.nextInt();

        if(a>b && a>c){
            System.out.println(a + " jest największa");
        }
        else{
            if(b>a && b>c){
                System.out.println(b + " jest największa");
            }
            else{
                System.out.println(c + " jest największa");
            }
        }


        //Zadanie 3
        System.out.println("\n Zadanie 3 \n");

        System.out.println("Podaj login: ");
        String login = skaner.next();
        System.out.println("Podaj hasło: ");
        String haslo = skaner.next();

        if(login.equals("admin") && haslo.equals("12345")){
            System.out.println("Zalogowano pomyślnie");
        }
        else{
            System.out.println("Błędny login lub hasło");
        }


        //Zadanie 4
        System.out.println("\n Zadanie 4 \n");

        System.out.println("Podaj liczbe 1: ");
        int x = skaner.nextInt();
        System.out.println("Podaj liczbe 2: ");
        int y = skaner.nextInt();
        System.out.println("Podaj liczbe 3: ");
        int z = skaner.nextInt();

        if(x > y && y > z){
            System.out.println("Kolejność malejąca");
        }
        else{
            if(z > y && y > x){
                System.out.println("Kolejność rosnąca");
            }
            else{
                System.out.println("Brak kolejności");
            }
        }

        if(x == y && y == z){
            System.out.println("3 liczby są takie same");
        }
        else{
            if(x == y || y == z || x == z){
                System.out.println("2 liczby są takie same");
            }
        }


        //Zadanie 5
        System.out.println("\n Zadanie 5 \n");

        System.out.println("Podaj liczbe 1: ");
        float g = skaner.nextFloat();
        System.out.println("Podaj liczbe 2: ");
        float h = skaner.nextFloat();

        System.out.println("Jakie ma być działanie? (+, -, *, /): ");
        char d = skaner.next().charAt(0);

        switch (d){
            case '+':
                float sum = g + h;
                System.out.println("Suma wynosi: " + sum);
                break;
            case '-':
                float odej = g - h;
                System.out.println("Wynik wynosi: " + odej);
                break;
            case '*':
                float mnoz = g * h;
                System.out.println("Wynik wynosi: " + mnoz);
                break;
            case '/':
                float dzie = g / h;
                System.out.println("Wynik wynosi: " + dzie);
                break;
            default:
                System.out.println("Nie podano żadnego dobrego działania");
                break;
        }
    }
}