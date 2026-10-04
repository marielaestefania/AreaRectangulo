/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.print("Ingresa tu peso en kilogramos: ");
        peso = entrada.nextDouble();

        System.out.print("Ingresa tu altura en metros: ");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Tu IMC es: " + imc);
    }
}
