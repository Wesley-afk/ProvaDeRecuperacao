/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provarec_questao9;

/**
 *
 * @author w.rocha
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class ProvaRec_Questao9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome = "";
        String categoria = "";
        Float peso;

        System.out.println("Lutador, digite seu nome.");
        nome = ler.nextLine();
        
        System.out.println("Lutador, digite o seu peso");
        peso = ler.nextFloat();   
        
        if(peso < 65){
            categoria = "Categoria pena";
        }
        else if(peso >= 65 && peso < 72){
            categoria = "Categoria leve";
        }
        else if(peso >= 72 && peso < 79){
            categoria = "Categoria ligeiro";
        }
        else if(peso >= 79 && peso < 86){
            categoria = "Categoria Meio médio";
        }
        else if(peso >= 86 && peso < 93){
           categoria = "Categoria Medio";
        }
        else if(peso >= 93 && peso < 100){
            categoria = "Categoria Meio pesado";
        }
        else{
            categoria = "Categoria pesado";
        }
        
       // FileWriter arquivo = new FileWriter("C:\Users\w.rocha\Desktop\another txt.txt");
       // PrintWriter gravar = new PrintWriter(arquivo);
        
        //gravar.println("O lutador" + nome + " pesa " + peso + " e se encaixa na categoria " + categoria);
        System.out.println("O lutador" + nome + " pesa " + peso + " e se encaixa na categoria " + categoria);
    }
}
