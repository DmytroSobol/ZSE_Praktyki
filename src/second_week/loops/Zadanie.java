package second_week.loops;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {


        //Zadanie 1
        System.out.println("\n Zadanie 1");
        for (int i = 0; i <= 20; i+=2){
            System.out.println("i = " + i);
        }


        //Zadanie 2
        System.out.println("\n Zadanie 2");
        for (int i = 30; i >= 0; i-=3){
            System.out.println("i = " + i);
        }


        //Zadanie 3
        System.out.println("\n Zadanie 3");
        for (int i = 1; i <=10; i++){
            for (int j = 1; j <=10; j++){
                int wynik = i*j;
                if(wynik%2 == 0){
                    System.out.println( i + " * " + j + " = X");
                }
                else{
                    System.out.println( i + " * " + j + " = " + wynik);
                }
            }
        }


        //Zadanie 4
        System.out.println("\n Zadanie 4");
        for (int i = -40; i <=40 ; i++){
            if (i%4 == 0){
                System.out.println(i);
            }
        }


        //Zadanie 5
        System.out.println("\n Zadanie 5");

            //Zadanie 1
            System.out.println("\n Zadanie 5.1");
            int i = 0;
            while (i <= 20){
                System.out.println("i = " + i);
                i+=2;
            }


            //Zadanie 2
            System.out.println("\n Zadanie 5.2");
            i =30 ;
            do{
                System.out.println("i = " + i);
                i-=3;
            }
            while (i>=0);


        //Zadanie *
        System.out.println("\n Zadanie *");
        for (int h = 0; h < 10; h++) {
            for (int j = 0; j < 10 - h; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * h + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }


        //Zadanie **
        System.out.println("\n Zadanie **");
        for (int j = 1; j<=10; j++){
            System.out.print("*");
        }
        System.out.println();
        for (int k = 1; k<=3; k++){
            for (i = 1; i <=10; i++) {
                if (i == 1 || i == 10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int j = 1; j<=10; j++){
            System.out.print("*");
        }

        //Zadanie ***
        System.out.println("\n Zadanie ***");
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj wysokość choinki: ");
        i = skaner.nextInt();

        for (int h = 0; h < i; h++) {
            for (int j = 0; j < i - h; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * h + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
