package com.umg.main;

import java.util.Scanner;

import com.umg.utils.Automata;
import com.umg.utils.Utils;

public class Consola {

	private static Scanner entrada;

	public static void main(String[] args) {
		String valor;
		System.out.println(".:: 		BIENVENIDOS 		::.");
		System.out.println("Alumno: Pablo Cesar Alvarez Barrios");
		System.out.println("Carnet: 5190-14-93");
		System.out.print("Ingrese un numero: ");
		entrada = new Scanner(System.in);
		valor = entrada.nextLine();

		String resultado = Automata.validaNumero(valor);
		String mensaje = Utils.validaCadena(resultado);
		System.out.println(mensaje);
	}

}
