/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc2;

import java.util.Scanner;

/**
 *
 * @author alexandre.9930
 */
public class exerc3b {
   public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
        
       int opcao, num1, num2, num3, num4, num5;
       
       
       
       double Marlboro = 10, Black = 15.5, La = 30, Eight = 4, Lucky = 15, resultado;
       
       
       System.out.println("---------------------------------");
       System.out.println("      Selecione um produto:      ");
       System.out.println("---------------------------------");
       System.out.println("| PRODUTO         |    VALOR    |");
       System.out.println("---------------------------------");
       System.out.println("| 1 | Marlboro    |      10     |");
       System.out.println("---------------------------------");
       System.out.println("| 2 | Black       |      15.5   |"); 
       System.out.println("---------------------------------");
       System.out.println("| 3 |  L.a        |      30     |"); 
       System.out.println("---------------------------------");
       System.out.println("| 4 |  Eight      |      4      |");
       System.out.println("---------------------------------");
       System.out.println("| 5 |  Lucky      |      15     |");
       System.out.println("---------------------------------");
       
       System.out.println("Informe o produto selecionado: ");
       
       opcao = scanner.nextInt();
       
     if(opcao == 1){
         System.out.println(" Informe a quantidade: ");
         num1 = scanner.nextInt();
         resultado = Marlboro * num1;
         System.out.println("Valor total: " + resultado);
     }else if(opcao == 2){
         System.out.println("Informe a quantidade: ");
         num2 = scanner.nextInt();
         resultado = Black * num2;
         System.out.println("Valor total: " + resultado);
     }else if(opcao == 3){
         System.out.println("Informe a quantidade: ");
         num3 = scanner.nextInt();
         resultado = La * num3;
         System.out.println("Valor total: " + resultado);
     
     }else if(opcao == 4){
         System.out.println("Informe a quantidade: ");
         num4 = scanner.nextInt();
         resultado = Eight * num4;
         System.out.println("Valor total: " + resultado);
     }else if(opcao == 5){
         System.out.println("Informe a quantidade: ");
         num5 = scanner.nextInt();
         resultado = Lucky * num5;
         System.out.println("Valor total: " + resultado);
     }
       
   } 
}
