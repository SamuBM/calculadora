package principal;

import java.util.Scanner;

public class uso_calculadora {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introduce numeros: ");
		String numeros = "";
		numeros = sc.nextLine();
		double total = 0.0;
		int contadorDeVueltas = 1;
		
		
		while (!numeros.equalsIgnoreCase("salir")) {
			if (numeros.contains("+")) {
				double result = suma(numeros);
				total += result;
				System.out.println(total);
			} else if (numeros.contains("-")) {
				if (contadorDeVueltas == 1) {
					double result = resta1(numeros);
					total = result;
					System.out.println(total);
				} else {
					double result = resta2(numeros);
					total += result;
					System.out.println(total);
				}
			} else if (numeros.contains("*")) {
				if (contadorDeVueltas == 1) {
					total = 1;
					double result = multi(numeros);
					total *= result;
					System.out.println(total);
				} else {
					double result = multi(numeros);
					total *= result;
					System.out.println(total);
				}
			} else if (numeros.contains("/")) {
				if (contadorDeVueltas == 1) {
					total = 1;
					double result = divi(numeros);
					total /= result;
					System.out.println(total);
				}else {
					double result = divi(numeros);
					total /= result;
					System.out.println(total);
				}

			}
			contadorDeVueltas = 2;
			System.out.println("===========================================");
			System.out.print("Introduce numeros: ");
			numeros = sc.nextLine();
		}
		System.out.println("Has salido");
	}
	/*
	 * =============================================================================
	 * ==================================
	 */
	public static double suma(String numeros) {
		String[] sumandos = numeros.split("\\+");
		if (sumandos[0].equalsIgnoreCase("")) {
			sumandos[0] = "0";
		}
		int result = 0;
		for (int i = 0; i < sumandos.length; i++) {
			double sumando = Integer.valueOf(sumandos[i]);
			result += sumando;
		}
		return result;
	}
	/*
	 * =============================================================================
	 * ==================================
	 */
	public static double resta1(String numeros) {
		String[] restas = numeros.split("\\-");
		if (restas[0].equalsIgnoreCase("")) {
			restas[0] = "0";
		}

		int result = Integer.valueOf(restas[0]);
		for (int i = 1; i < restas.length; i++) {
			double resta = Integer.valueOf(restas[i]);
			result -= resta;
		}
		return result;
	}
	/*
	 * =============================================================================
	 * ==================================
	 */
	public static double resta2(String numeros) {
		String[] restas = numeros.split("\\-");
		int result = 0;
		for (int i = 0; i < restas.length; i++) {
			if (restas[i].equalsIgnoreCase("")) {
				restas[i] = "0";
			}
			double resta = Integer.valueOf(restas[i]);
			result -= resta;
		}
		return result;
	}
	/*
	 * =============================================================================
	 * ==================================
	 */
	public static double multi(String numeros) {
		String[] multiplicadores = numeros.split("\\*");
		if (multiplicadores[0].equalsIgnoreCase("")) {
			multiplicadores[0] = "1";
		}
		double result = Integer.valueOf(multiplicadores[0]);
		for (int i = 1; i < multiplicadores.length; i++) {
			int nMulti = Integer.valueOf(multiplicadores[i]);
			result *= nMulti;
		}
		return result;
	}
	/*
	 * =============================================================================
	 * ==================================
	 */
	public static double divi(String numeros) {
		String[] divisores = numeros.split("\\/");
		if (divisores[0].equalsIgnoreCase("")) {
			divisores[0] = "1";
		}
		double result = Integer.valueOf(divisores[0]);
		for (int i = 1; i < divisores.length; i++) {
			int nDiv = Integer.valueOf(divisores[i]);
			result *= nDiv;
		}
		return result;
	}
}
