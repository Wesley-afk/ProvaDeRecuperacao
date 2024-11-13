/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provarec_questao1;

import java.util.Scanner;

/**
 *
 * @author w.rocha
 */
public class ProvaRec_Questao1 {

      public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anos = 0;
        int dias = 0;
        int meses = 0;
        
        System.out.println("Quantos anos você tem?");
        anos = ler.nextInt();
        
        System.out.println("Quantos meses?");
        meses = ler.nextInt();
        
        System.out.println("Quantos dias");
        dias = ler.nextInt();
        
        int diasTotais = (anos * 365) + (meses * 30) + dias;
        
        
        System.out.println("Você possui: " + anos + " anos, " + meses + " meses, " + "E " +diasTotais+ " dias");
        
    }
     
    
}
