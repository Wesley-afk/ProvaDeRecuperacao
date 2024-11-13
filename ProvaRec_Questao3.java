/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provarec_questao3;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ProvaRec_Questao3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int inteiro = 0;
        int antescessor = 0;
                
        JOptionPane.showInputDialog(null, "Digite um numero inteiro");
        inteiro = ler.nextInt();
        antescessor = inteiro - 1;
        
        JOptionPane.showMessageDialog(null, "O antescessor de " + inteiro + "é:" + antescessor + "E seu sucessor é: " + inteiro + 1);

    }
}
