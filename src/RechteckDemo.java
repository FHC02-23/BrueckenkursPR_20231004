public class RechteckDemo {
    public static void main(String[] args) {
        int laenge = 20;
        int breite = 25;

        int umfang = 2 * (laenge + breite);
        int flaeche = laenge * breite;

        System.out.println("flaeche = " + flaeche);
        System.out.println("umfang = " + umfang);
    }
}
