/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.busquedabinaria;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author bladimir
 */
public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        int numeroBuscar;
        int n = 0; //tama;o del arreglo
        int numero;
        String decide;
        int comparar;
        int[] numeros = new int[50];
        int cant = 0;
        boolean bandera = false;

        //llenar el array list
        System.out.println("LLENANDO EL ARRAY CON NUMEROS ALEATORIOS");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)(Math.random()*numeros.length)+1;
        }
        
        //Metodo de ordenamiento

        for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[i] < numeros[j]) {
					int temp = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = temp;
				}
			}
		}
		System.out.println("\nAfter Sorting...");
		for (int i : numeros) {
			System.out.print(i+" ");
		}

        //Busqueda del número
        System.out.println("buscar numero en busqueda binaria ingrese numero a buscar");
        numeroBuscar = entrada.nextInt();
        MetodoBusqueda buscar = new MetodoBusqueda();

        comparar = buscar.busquedaBinaria(numeros, n, numeroBuscar);
        if (comparar == numeroBuscar) {
            System.out.println("numero encontrado");
        } else if (comparar == -1) {
            System.out.println("no existe el numero buscado");
        }

    }
}
