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
public class exercicio1b {
   public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
       
       float num1, perc, resultado;
       
       System.out.println("Informe um numero: ");
      num1 = scanner.nextFloat();
       
       System.out.println("Informe um percentual: ");
       perc = scanner.nextFloat();
       
       resultado = num1 * perc;
       
       resultado = resultado / 100;
       
       System.out.println(resultado);
       
   
   } 
}
