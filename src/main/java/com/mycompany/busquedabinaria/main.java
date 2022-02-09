package com.mycompany.busquedabinaria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bladimir
 */
public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        int numeroBuscar;
        int n; //tama;o del arreglo
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
		System.out.println("");
		for (int i : numeros) {
			System.out.print(numeros[i]+" ");
		}

        /*for (int j = 0; j < numeros.length; j++) {
            System.out.println(""+numeros[j]);
        }*/
        n = numeros.length;
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