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
public class exerc2b {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int num1 = 5;
        
        System.out.println("Informe a idade do atleta: ");
        num1 = scanner.nextInt();
        
        if(num1 <= 7){
            System.out.println(" Infantial A! ");
        }else if( num1 <= 10){
            System.out.println(" Infantil B! ");
        
        }else if(num1 <= 13){
            System.out.println(" Juvenil A! ");
        }else if(num1 <= 17){
            System.out.println(" Juvenil B! ");
        
        }else if(num1 >= 18){
            System.out.println(" Aduto! ");
        }
            
    }
}
