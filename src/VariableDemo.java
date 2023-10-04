public class VariableDemo {
    public static void main(String[] args) {
        // Namen für Speicherstellen
        int i = 42; // Ganzzahlen; byte (0..255 ; -128..0..+127)/short/int/long
        double pi = 3.1415; // Gleitkommazahlen; float/double
        boolean b = true; // Wahrheitswerte; true/false
        char cA = 'A'; // Character
        char cB = 68; // Ascii-Tabelle
        String vorname = "Susi";
        String nachname = "Sorglos";

        System.out.println("Der Name lautet: " + vorname + " " + nachname);
        System.out.println("cB = " + cB);
        System.out.println("cA = " + cA);

        double radius = 8;
        double umfangKreis = 2 * radius * Math.PI;
        System.out.println("umfangKreis = " + umfangKreis);
        
    }
}
