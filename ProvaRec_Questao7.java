/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provarec_questao7;

/**
 *
 * @author w.rocha
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class ProvaRec_Questao7 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int num = 0;
       
        System.out.println("Digite um numero inteiro");
        num = ler.nextInt();
        
        FileWriter arquivo = new FileWriter("C:\Users\w.rocha\Desktop\tabuada rec.txt");
        // detalhe que eu copiei como caminho, colei aí e não foi. contrabarra não funciona. \\\\\\\ "C:\Users\w.rocha\Desktop\tabuada rec.txt"
        
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.println("Tabuada de " + num);
        
        for (int i = 0; i < 11; i++) {
        gravar.println(num + " x " + i + " = " + num * i);   
        }
    }
}
