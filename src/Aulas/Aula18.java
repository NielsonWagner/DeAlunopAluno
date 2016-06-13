package Aulas;

import java.util.Scanner;

public class Aula18 {
    
    public static void main (String [] args){
    
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite o nome do usuário: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite sua senha: ");
        int senha = ler.nextInt();
        
        //uso da ferramenta if e else
        if(nome.equals("Nielson") && (senha == 38)) {
            System.out.println("Seu nome de usuário está correto");
        }
        else 
            System.out.println("Nome do usuário ou senha estão incorreto");
}
    
}
    

