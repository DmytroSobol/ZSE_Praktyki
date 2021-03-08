package third_week.packages.Zadanie;

public class zadanie6 {
    public static class Super{
        public void nadpisanie(){
            System.out.println("Ta linijka jest nadpisana z class Super");
        }
    }
    public static class Tekst extends Super{
        public void nadpisanie(){
            super.nadpisanie();
            System.out.println("Ta linijka jest w class Tekst i napisana po komendzie super");
        }
    }

    public static void main(String[] args) {
        Tekst tresc = new Tekst();
        tresc.nadpisanie();
    }
}
