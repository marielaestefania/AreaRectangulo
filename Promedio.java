/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedio;
 import java.util.Scanner;
public class Promedio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;
        double numero3;
        double promedio;
        System.out.print("Ingresa el primer numero:");
        numero1 = entrada.nextDouble();
        System.out.print("Ingresa el segundo numero:");
        numero2 = entrada.nextDouble();
        System.out.print("Ingresa el tercer numero:");
        numero3 = entrada.nextDouble();
        promedio = (numero1 + numero2 + numero3) / 3;
        System.out.println("El promedio es: " + promedio);
            }
        }
