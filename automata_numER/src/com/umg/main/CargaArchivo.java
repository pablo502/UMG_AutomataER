package com.umg.main;

import java.io.FileNotFoundException;

import com.umg.utils.Utils;

public class CargaArchivo {

	public static void main(String[] args) {
		try {
			System.out.println(".:: 		BIENVENIDOS 		::.");
			System.out.println("Alumno: Pablo Cesar Alvarez Barrios");
			System.out.println("Carnet: 5190-14-93");
			Utils.lecturaArchivo("C:\\Users\\pablo\\Desktop\\archivo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado: " + e.getMessage());
		}

	}

}
