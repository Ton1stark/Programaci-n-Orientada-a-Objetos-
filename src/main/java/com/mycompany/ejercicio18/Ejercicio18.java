/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        double salario_bruto;
        double salario_neto;
        double numero_horas_trabajadas_mes;
        double valor_hora_trabajada_mes;
        double porcentaje_retencion;
        String nombre, apellido, nombre_empleado;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese código del empleado:");
        int codigo_empleado = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese nombre del empleado:");
        nombre = entrada.next();

        System.out.println("Ingrese apellido del empleado:");
        apellido = entrada.next();
        
        nombre_empleado = nombre+ " " +apellido;

        
        System.out.println("Ingrese el número de horas trabajadas al mes:");
        numero_horas_trabajadas_mes = entrada.nextInt();
        
        
       System.out.println("Ingrese el valor de las horas trabajadas al mes:");
       valor_hora_trabajada_mes = entrada.nextDouble();
       
       
       System.out.println("Ingrese el valor de la retencion:");
       double retencion = entrada.nextDouble();
       
       Empleado empleado1 = new Empleado();
       
       porcentaje_retencion = empleado1.calcular_porcentaje_retencion(retencion);
       salario_bruto = empleado1.calcular_salario_bruto(numero_horas_trabajadas_mes,valor_hora_trabajada_mes);
       salario_neto = empleado1.calcular_salario_neto(salario_bruto, porcentaje_retencion);
     
      System.out.println("CODIGO " + codigo_empleado);
      System.out.println("Nombre " + nombre_empleado);
      System.out.println("Salario Bruto " + salario_bruto);
      System.out.println("Salario Neto " + salario_neto);
     
     }
}

