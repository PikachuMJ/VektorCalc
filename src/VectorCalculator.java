import java.util.Scanner;

@SuppressWarnings("all")
public class VectorCalculator {
    static int x1, y1, z1, x2, y2, z2;
    public static void frage(){
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Erster Vektor: Geben sie x1 ein.");
        x1 = eingabe.nextInt();
        System.out.println("Erster Vektor: Geben sie y1 ein.");
        y1 = eingabe.nextInt();
        System.out.println("Erster Vektor: Geben sie z1 ein.");
        z1 = eingabe.nextInt();
        System.out.println("Zweiter Vektor: Geben sie x2 ein.");
        x2 = eingabe.nextInt();
        System.out.println("Zweiter Vektor: Geben sie y2 ein.");
        y2 = eingabe.nextInt();
        System.out.println("Zweiter Vektor: Geben sie z2 ein.");
        z2 = eingabe.nextInt();
        eingabe.close();
    }
    public static void skalarprodukt(){
        int skalarprodukt = x1 * x2 + y1 * y2 + z1 * z2;
        System.out.println("Skalarprodukt: " + skalarprodukt);
    }
    public static void skalarprodukt(int x1, int y1, int z1, int x2, int y2, int z2){
        int skalarprodukt = x1 * x2 + y1 * y2 + z1 * z2;
        System.out.println("Skalarprodukt: " + skalarprodukt);
    }
    public static void länge(){
        double laenge = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
        System.out.println("Laenge: " + laenge);
    }
    public static void länge(int x1, int y1, int z1, int x2, int y2, int z2){
        double laenge = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
        System.out.println("Laenge: " + laenge);
    }
    public static void winkel(){
        int vec1 = x1*y1*z1;
        int vec2 = x2*y2*z2;
        int vec1Betrag =  Math.abs(x1*y1*z1);
        int vec2Betrag = Math.abs(x2*y2*z2);
        int winkel = (vec2 * vec1) / (vec1Betrag * vec2Betrag);
        System.out.println("Winkel: " + winkel);
    }
    public static void winkel(int x1, int y1, int z1, int x2, int y2, int z2){
        int vec1 = x1*y1*z1;
        int vec2 = x2*y2*z2;
        int vec1Betrag =  Math.abs(x1*y1*z1);
        int vec2Betrag = Math.abs(x2*y2*z2);
        int winkel = (vec2 * vec1) / (vec1Betrag * vec2Betrag);
        System.out.println("Winkel: " + winkel);
    }
    public static void main(String[] args) {
        System.out.println("welches verfahren: 1: Skalarprodukt, 2: Laenge, 3: Winkel");
        Scanner eingabe = new Scanner(System.in);
        int verfahren = eingabe.nextInt();
        if(verfahren == 1){
            frage();
            skalarprodukt();
        }
        if(verfahren == 2){
            frage();
            länge();
        }
        if(verfahren == 3){
            frage();
            winkel();
        }
    }
}
