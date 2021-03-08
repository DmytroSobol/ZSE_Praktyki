package third_week.packages.Zadanie;

public class zadanie5 {
    public static class Kuchnia {
        public void wejscie(){
            System.out.println("Wszedłeś na kuchnie");
        }
    }
    public static class Lodówka extends Kuchnia{
        public void otworzyłeś(){
            System.out.println("Otworzyłeś lodówke");
        }
    }
    public static class Produkty extends Lodówka{
        public void zobaczyłeś(){
            System.out.println("Zobaczyłeś produkty");
        }
    }

    public static void main(String[] args) {
        Produkty produkty = new Produkty();
        produkty.wejscie();
        produkty.otworzyłeś();
        produkty.zobaczyłeś();
    }

}
