package first_week.basics;

public class lekcja {
    public static void main(String[] args) {

        int myIntA = 1;
        int myIntB = -32;
        int myIntC = 77;

        int sum = myIntA + myIntB + myIntC;
        System.out.println("Dodawnanie wynik: " + sum);

        sum = myIntA - myIntB - myIntC;
        System.out.println("Odejmowanie wynik: " + sum);

        sum = myIntA * myIntB * myIntC;
        System.out.println("Mnozenie wynik: " + sum);

        sum = myIntB / 2;
        System.out.println("Dzienie B przez 2: " + sum);

        sum = myIntC / 2;
        System.out.println("Dzienie C = 77 przez 2: " + sum);

        double myDoubleA = 1.65;
        double myDoubleB = 1.44;

        double sumDouble;
        sumDouble = myDoubleA * myDoubleB;

        System.out.println(sumDouble);

        char myCharA = 'F';
        char myCharB = 'T';
        char myCharC = '$';

        System.out.println("Moja litera: " + myCharA);
        System.out.println("Moj znak to: " + myCharC);

        int sumChar = myCharA + myCharB + myCharC;
        System.out.println("Suma znaków to : " + sumChar);

        String myStringA = "Ja";
        String myStringB = "lubie placki";
        String myStringC = " z dzemem.";

        System.out.println(myStringA + "\n\n\n\n" + myStringB + myStringC);


        // boolean
        boolean myBoolean = true;

        System.out.println(!myBoolean);
    }
}
