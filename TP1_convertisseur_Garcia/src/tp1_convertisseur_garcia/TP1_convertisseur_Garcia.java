/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_garcia;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class TP1_convertisseur_Garcia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valeur;
        double kelvin;
        Scanner e1 = new Scanner(System.in);
        System.out.print("\n Entrer une valeur :");
        valeur = e1.nextDouble();
        kelvin=valeur+273;
        System.out.print("\n la temperature est de "+valeur+"degres, la temperature en kelvin est de "+kelvin+"K");
        
    }
    
}
