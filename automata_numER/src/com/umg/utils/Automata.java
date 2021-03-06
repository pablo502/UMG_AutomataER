package com.umg.utils;

public class Automata {

	public static String validaNumero(String numero) {
		int posicion = 0;
		String estado = Constantes.INICIO;
		Boolean rechazado = false;
		while (!rechazado && posicion < numero.length()) {
			char simbolo = numero.charAt(posicion);
			switch (estado) {
			case Constantes.INICIO:
				if (Character.isDigit(simbolo)) {
					estado = Constantes.ENTERO;
				} else if (simbolo == '+' || simbolo == '-') {
					estado = Constantes.Q0;
				} else {
					rechazado = true;
				}
				break;
			case Constantes.Q0:
				if (Character.isDigit(simbolo)) {
					estado = Constantes.ENTERO;
				} else if (simbolo == '.') {
					estado = Constantes.Q1;
				} else {
					rechazado = true;
				}
				break;
			case Constantes.Q1:
				if (Character.isDigit(simbolo)) {
					estado = Constantes.DECIMAL;
				} else {
					rechazado = true;
				}
				break;
			case Constantes.ENTERO:
				if (Character.isDigit(simbolo)) {
					estado = Constantes.ENTERO;
				} else if (simbolo == '.') {
					estado = Constantes.Q1;
				} else {
					rechazado = true;
				}
				break;
			case Constantes.DECIMAL:
				if (Character.isDigit(simbolo)) {
					estado = Constantes.DECIMAL;
				} else {
					rechazado = true;
				}
				break;
			}
			posicion++;
		}
		if (rechazado) {
			estado = Constantes.NO_RECONOCIDO;
		}
		return estado;

	}

}
