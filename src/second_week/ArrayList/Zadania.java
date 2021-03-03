package second_week.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Zadania {

    public static void main(String[] args) {

        //Zadanie 1
        System.out.println("\n\n Zadanie 1");

        int[][] tab = new int[5][5];

        int value = 0 , j;

        for (int i = 0; i <=4; i++){
            for (j = 0; j <= 4; j++){
                tab[i][j] = value;
                value += 5;
            }
        }
        for (int i = 0; i <=4; i++){
            for (j = 0; j <= 4; j++){
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }


        //Zadanie 2
        System.out.println("\n\n Zadanie 2");

        int n, m;
        value = 0;

        int[][][][] tab1 = new int [3][3][3][3];

        for (int i = 0; i <=2; i++){
            for (j = 0; j <= 2; j++){
                for (m = 0; m <=2; m++){
                    for (n = 0; n <= 2; n++){
                        tab1[i][j][m][n] = value;
                        value++;
                    }
                }
            }
        }

        for (int i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                for (m = 0; m <=2; m++){
                    for (n = 0; n <= 2; n++){
                        System.out.print("[" + i + "][" + j + "][" + m + "][" + n + "] = " +  tab1[i][j][m][n] + " \t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }


        //Zadanie 3
        System.out.println(" Zadanie 3");

        int k;
        value = 0;

        int[][][][][] tab2 = new int [2][2][2][2][2];

        for (int i = 0; i <=1; i++){
            for (j = 0; j <= 1; j++){
                for (m = 0; m <=1; m++){
                    for (n = 0; n <= 1; n++){
                        for (k =0; k <= 1; k++){
                            tab2[i][j][m][n][k] = value;
                            value++;
                        }
                    }
                }
            }
        }

        for (int i = 0; i <= 1; i++){
            for (j = 0; j <= 1; j++){
                for (m = 0; m <=1; m++){
                    for (n = 0; n <= 1; n++){
                        for (k =0; k <= 1; k++){
                            System.out.print("[" + i + "][" + j + "][" + m + "][" + n + "][" + k + "] = " +  tab2[i][j][m][n][k] + " \t");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }


        //Zadanie 4
        System.out.println(" Zadanie 4");

        Random random = new Random();

        int[][] tablica1 = new int [2][2];
        int[][] tablica2 = new int [2][2];
        int[][] tablica3 = new int [2][2];

        for (j = 0; j <= 1; j++){
            for (k = 0; k <=1; k++){
                tablica1[j][k] = random.nextInt(10000);
            }
        }
        for (j = 0; j <= 1; j++){
            for (k = 0; k <=1; k++){
                tablica2[j][k] = random.nextInt(10000);
            }
        }
        for (j = 0; j <= 1; j++){
            for (k = 0; k <=1; k++){
                tablica3[j][k] = tablica1[j][k] + tablica2[j][k];
            }
        }

        System.out.println("Tablica 1");
        for (j = 0; j <= 1; j++){
            for (k = 0; k <=1; k++){
                System.out.print("[" + tablica1[j][k] + "] \t");
            }
            System.out.println();
        }
        System.out.println("Tablica 2");
        for (j = 0; j <= 1; j++){
            for (k = 0; k <=1; k++){
                System.out.print("[" + tablica2[j][k] + "] \t");
            }
            System.out.println();
        }
        System.out.println("Tablica 3");
        for (j = 0; j <= 1; j++){
            for (k = 0; k <=1; k++){
                System.out.print("[" + tablica1[j][k] + "] + [" + tablica2[j][k] + "] = [" + tablica3[j][k] + "] \t");
            }
            System.out.println();
        }


        //Zadanie 1-Lista
        System.out.println("\n\n Zadanie 1-Lista");

        ArrayList<String> lista = new ArrayList<>();

        System.out.println("Lista po stworzeniu: " + lista);

        lista.add("CS:GO");
        lista.add("Minecraft");
        System.out.println("Lista po dodaniu zwykłym: " + lista);

        lista.add(1,"Dota 2");
        System.out.println("Lista po dodaniu na indeks: " + lista);

        lista.remove("CS:GO");
        System.out.println("Lista po usunięciu po nazwie: " + lista);

        lista.remove(0);
        System.out.println("Lista po usunięciu po indeksu: " + lista);

        lista.set(0,"Battlefield 1");
        System.out.println("Lista po nadpisywaniu: " + lista);

        lista.add("Rust");
        lista.add("Minecraft");
        lista.add("Foxhole");
        lista.add("CS:GO");
        System.out.println("Lista po dodaniu nowych gier (przed sortowaniem): " + lista); // Dodałem nowe gry, żeby było co sortować

        Collections.sort(lista);
        System.out.println("Lista po sortowaniu: " + lista);

        lista.clear();
        System.out.println("Lista po czyszczeniu: " + lista);
    }

}
