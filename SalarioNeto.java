/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salarioneto;
import java.util.Scanner;

public class SalarioNeto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salarioBruto;
        double porcentajeImpuestos;
        double deducciones;
        double impuesto;
        double salarioNeto;

        System.out.print("Ingresa el salario bruto mensual: ");
        salarioBruto = entrada.nextDouble();

        System.out.print("Ingresa el porcentaje de impuestos: ");
        porcentajeImpuestos = entrada.nextDouble();

        System.out.print("Ingresa las deducciones adicionales: ");
        deducciones = entrada.nextDouble();

        impuesto = salarioBruto * (porcentajeImpuestos / 100);

        salarioNeto = salarioBruto - impuesto - deducciones;

        System.out.println("El salario neto es: " + salarioNeto);
    }
}
