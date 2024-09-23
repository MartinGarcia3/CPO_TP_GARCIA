/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.print("Please enter the operator:\n" +
"1) add\n" +
"2) substract\n" +
"3) multiply\n" +
"4) divide\n" +
"5) modulo");
      int operateur;
      Scanner op = new Scanner(System.in);
System.out.println("\n Entrer un entier :");
operateur=op.nextInt();
if(operateur>5){
     System.out.print("veuillez entrez un entier entre 1 et 5");
     System.exit(0);
}
       float operande1;
      Scanner op1 = new Scanner(System.in);
System.out.println("\n Entrer une premiere valeur :");
operande1=op1.nextInt();
       float operande2;
      Scanner op2 = new Scanner(System.in);
System.out.println("\n Entrer une deuxieme valeur :");
operande2=op2.nextInt();
float result;
result=0;
if (operateur==1) {
        result=operande1+operande2; 
                }
if (operateur==2) {
        result=operande1-operande2;
}
if (operateur==3) {
        result=operande1*operande2;
}
if (operateur==4) {
    result=operande1/operande2;
}
else if(operateur==5) {
    result=operande1%operande2;
}

System.out.print("votre resultat est "+result);
        
      
    }

   
}
