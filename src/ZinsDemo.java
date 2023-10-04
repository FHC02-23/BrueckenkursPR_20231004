public class ZinsDemo {

    // Unterprogramme / Unterkapitel => erfüllt einen Arbeitsauftrag
    // public static Rückgabewert Namen(Parameterliste)
    // public static double doSomething(double k, double z)
    // wenn kein Rückgabewert, dann void
    public static double berechneZinsen(double kontostand, double zinsen) {
        double berechneteZinsen = kontostand * (zinsen / 100.0);
        return berechneteZinsen;// da hast du das Ergebnis
    }

    // Hauptprogramm
    public static void main(String[] args) {
        double kontostand = 1_000;
        double zinsen = 2.25;
        
        double berechneteZinsen = 0;

        System.out.println("berechneteZinsen = " + berechneteZinsen);
        //kontostand = kontostand + berechneteZinsen;
        //kontostand += berechneteZinsen;

        berechneteZinsen = berechneZinsen(kontostand, zinsen);
        kontostand = berechneteZinsen + kontostand;
        System.out.println("kontostand = " + kontostand);

        System.out.println("berechneZinsen(10_000, 3,1) = " + berechneZinsen(10_000, 3.1));
        
        kontostand = kontostand + berechneZinsen(kontostand, zinsen);
        System.out.println("kontostand = " + kontostand);
    }




}
