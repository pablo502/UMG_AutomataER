package com.umg.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utils {

	public static void lecturaArchivo(String archivo) throws FileNotFoundException {
		String cadena;
		FileReader f = new FileReader(archivo);
		BufferedReader b = new BufferedReader(f);
		try {
			while ((cadena = b.readLine()) != null) {
				System.out.println("Valor en el archivo: " + cadena);
				String resultado = Automata.validaNumero(cadena);
				String mensaje = validaCadena(resultado);
				System.out.println(mensaje);
			}
			b.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static String validaCadena(String cadena) {
		String mensaje = null;
		if (cadena == Constantes.ENTERO) {
			mensaje = "El numero ingresado es ENTERO.";	
		} else if (cadena == Constantes.DECIMAL) {
			mensaje = "El numero ingresado es DECIMAL.";	
		} else {
			mensaje = "El valor ingresado es incorrecto.";
		}
		return mensaje;
		
	}

}
