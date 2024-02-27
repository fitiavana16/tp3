import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        double nombre = scanner.nextDouble();
        System.out.print("Entrez la puissance : ");
        int puissance = scanner.nextInt();

        double resultat = calculPuissance(nombre, puissance);
        System.out.println("Le résultat de " + nombre + "^" + puissance + " est : " + resultat);
    }

    public static double calculPuissance(double nombre, int puissance) {
        double resultat = 1;
        for (int i = 0; i < puissance; i++) {
            resultat *= nombre;
        }
        return resultat;
    }
    }
