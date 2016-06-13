package Aulas;

import java.util.Scanner;

public class Aula17 {
    public static void main (String [] args){
        
        // Trabalhando com String
        Scanner ler = new Scanner (System.in);
        System.out.println("Qual o seu Nome? ");
        String nome = ler.nextLine();
        
        System.out.println("Olá " + nome);
        System.err.println("Qunatos anos você tem?");
        int idade = ler.nextInt();
        
        System.out.println("Obrigado por responder: " + nome + " tem " + idade 
                + " anos ");
        
    }
}
