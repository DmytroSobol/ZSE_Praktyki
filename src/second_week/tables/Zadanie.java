package second_week.tables;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static java.util.Arrays.sort;

public class Zadanie {

    public static void main(String[] args) {

        //Zadanie 1
        System.out.println("\n\n Zadanie 1");

        char tab[] = {'k','r','m','y','d','w','t','u','i','p'};
        System.out.print("Tablica wynosi {");
        for(int i = 0; i < tab.length ; i++){
            if (i == tab.length - 1){
                System.out.print(tab[i] + "}");
            }
            else {
                System.out.print(tab[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Tablica posortowana");
        sort(tab);
        System.out.print("Tablica wynosi {");
        for(int i = 0; i < tab.length ; i++){
            if (i == tab.length - 1){
                System.out.print(tab[i] + "}");
            }
            else {
                System.out.print(tab[i] + ", ");
            }
        }


        //Zadanie 2
        System.out.println("\n\n Zadanie 2");
        String tab1[] = {"Stwórz","tablicę","z","10","elementami","i","posortuj","tą","tablicę","malejąco"};
        System.out.print("Tablica wynosi {");
        for(int i = 0; i < tab1.length ; i++){
            if (i == tab1.length - 1){
                System.out.print(tab1[i] + "}");
            }
            else {
                System.out.print(tab1[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Tablica posortowana malejąco");
        sort(tab1, Collections.reverseOrder());
        System.out.print("Tablica wynosi {");
        for(int i = 0; i < tab1.length ; i++){
            if (i == tab1.length - 1){
                System.out.print(tab1[i] + "}");
            }
            else {
                System.out.print(tab1[i] + ", ");
            }
        }

        Random random = new Random();

        //Zadanie 3
        System.out.println("\n\n Zadanie 3");
        String pies[] = {"Pimpek", "Puszek", "Alex"};
        int select = random.nextInt(pies.length);
        System.out.println("Wylosowane imię dla psa: " + pies[select]);


        //Zadanie 4
        System.out.println("\n\n Zadanie 4");
        String danie[] = {"Bułka z masłem ", "Hamburger ", "Frytki ", "Nic ", "Jabłko ", "Ryż "};
        int sniadanie = random.nextInt(danie.length);
        int obiad = random.nextInt(danie.length);
        int kolacja = random.nextInt(danie.length);
        System.out.println("Na śniadanie zjem: " + danie[sniadanie] + "\nNa obiad zjem: " + danie[obiad] + "\nNa kolacje zjem: " + danie[kolacja]);


        //Zadanie 5
        System.out.println("\n\n Zadanie 5");
        String tab2[] = {"18", "5", "15", "14", "11", "7", "12", "6", "2", "8", "17", "19", "16", "20", "9", "1", "4", "10", "3", "13"};
        System.out.print("Tablica wynosi {");
        for(int i = 0; i < tab2.length ; i++){
            if (i == tab2.length - 1){
                System.out.print(tab2[i] + "}");
            }
            else {
                System.out.print(tab2[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Tablica posortowana");
        Arrays.sort(tab2,0,9);
        Arrays.sort(tab2,10,20, Collections.reverseOrder());
        System.out.print("Tablica wynosi {");
        for(int i = 0; i < tab2.length ; i++){
            if (i == tab2.length - 1){
                System.out.print(tab2[i] + "}");
            }
            else {
                System.out.print(tab2[i] + ", ");
            }
        }
    }

}