/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provarec_questao5;

import java.util.Scanner;

/**
 *
 * @author w.rocha
 */
public class ProvaRec_Questao5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0;
        int media = 0;
        int soma = 0;
        
        System.out.println("Digite um numero N");
        num = ler.nextInt();
        
        int[] array = new int[num]; 
        
        for (int i = 0; i < num; i++) {
            System.out.println("Digite valores");
            array[i] = ler.nextInt();
            soma += array[i];
        }
        
        System.out.println("Soma " + soma);
        System.out.println("Quantidade " + num);
        System.out.println("Media " + soma /num);
    }
}
        
