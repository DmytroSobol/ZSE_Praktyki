package second_week.methodsAndObjects;

import java.util.Scanner;

interface piecPiekacz{
    void ciastka();
    void chleb();
}

interface piecGril{
    void grilowanie();
}

public class Zadanie implements piecGril, piecPiekacz{

    private String name;
    private int temperatura;
    private int czas;

    @Override
    public void ciastka() {
        name = "Pieczenie ciastek";
        temperatura = 200;
        czas = 30;
        wlaczPiec();
    }

    @Override
    public void chleb() {
        name = "Pieczenie chleba";
        temperatura = 170;
        czas = 120;
        wlaczPiec();
    }

    @Override
    public void grilowanie() {
        name = "Grilowanie kurczaka";
        temperatura = 250;
        czas = 45;
        wlaczPiec();
    }

    private void wlaczPiec() {
        System.out.println("Rozpoczęto " + name + " przy temperaturze: " + temperatura + " stopni, które potrwa: " + czas + " minut.");
    }

    public static void main(String[] args) {
        Zadanie piec = new Zadanie();

        piecPiekacz piekacz = piec;
        piecGril gril = piec;

        Scanner skaner = new Scanner(System.in);

        System.out.println("1. Pieczenie ciastek \n 2. Pieczenie chleba \n 3. Grilowanie kurczaka");
        System.out.print("Wpisz jaką funkcję ma wypełnić piec: ");
        int i = skaner.nextInt();

        switch (i){
            case 1:
                piekacz.ciastka();
                break;
            case 2:
                piekacz.chleb();
                break;
            case 3:
                gril.grilowanie();
                break;
            default:
                System.out.println("Podano zły punkt");
                break;
        }
    }
}
