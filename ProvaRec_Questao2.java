/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provarec_questao2;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class ProvaRec_Questao2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int cafeExpresso = 0;
        int cafeCaputtino = 0;
        int leiteComCafe = 0;
        int qtdCafeExpresso = 0;
        int qtdcafeCaputtino = 0;
        int qdleiteComCafe = 0;      
        int opcao = 0;
        boolean totalizarVendas = false;
        
        // meu teclado continua sendo incapaz de dar contra barra - ///// \\\\\\\\\\\\ |||||||||||||||||||||||||  esse: \ é a contrabarra dele.
        
        
        while(totalizarVendas == false){
            System.out.println("------- Bem vindo a cafeteria, qual e o seu pedido? -------");
            System.out.println(" 1 - Café Expresso");
            System.out.println(" 2 - Capputino");
            System.out.println(" 3 - leiteComCafe");
            System.out.println(" 4 - relatório");
            opcao = ler.nextInt();
            
            if(opcao == 1){
                System.out.println("Voce realizou a compra de um cafe expresso de  $0,75");
                qtdCafeExpresso = qtdCafeExpresso + 1;
            }
            
            else if(opcao == 2){
                System.out.println("Voce realizou a compra de um Capputino de  R$ 1,00");
                qtdcafeCaputtino = qtdcafeCaputtino + 1;
                 
            }
            
            else if(opcao == 3){
                System.out.println("Voce realizou a compra de um Cafe com leite de R$ 1,25 ");
                qdleiteComCafe = qdleiteComCafe + 1;     
            }
         
            else{
                totalizarVendas = true;
            System.out.println("------------------------- RELATÓRIO -------------------------");
            System.out.println("Foram vendidos " + qtdCafeExpresso + " Cafe expresso,  Arrecadando " + (qtdCafeExpresso * 0.75));
            System.out.println("Foram vendidos " + qtdcafeCaputtino + " Cafe expresso,  Arrecadando " + (qtdcafeCaputtino * 1.00));
            System.out.println("Foram vendidos " + qdleiteComCafe + " Cafe expresso,  Arrecadando " + (qdleiteComCafe * 1.25));
            }
            
            
            
            
        }
      
        
    }
}
