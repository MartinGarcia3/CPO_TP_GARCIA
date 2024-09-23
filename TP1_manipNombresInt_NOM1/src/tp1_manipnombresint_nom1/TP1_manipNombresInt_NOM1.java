/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_nom1;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class TP1_manipNombresInt_NOM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int entier1;
        Scanner e1 = new Scanner(System.in);
        System.out.println("\n Entrer un premier entier :");
        entier1 = e1.nextInt();
        int entier2;
        Scanner e2 = new Scanner(System.in);
        System.out.println("\n Entrer un deuxieme entier :");
        entier2 = e2.nextInt();
        int somme;
        int diff;
        int produit;
        int quotient;
        float reste;
        somme = entier1 + entier2;
        diff = entier1 - entier2;
        produit = entier1 * entier2;
        quotient = entier1 / entier2;
        reste = (float) ((entier1 * 1.0) / (entier2 * 1.0)) - quotient;

        System.out.print("la somme des deux entiers est " + somme + "   ");
        System.out.print("la difference des deux entiers est " + diff + "  ");
        System.out.print("le produit des deux entiers est " + produit + "  ");
        System.out.print("le quotient des deux entiers est " + quotient + " le reste de cette division est " + reste);

    }

}
