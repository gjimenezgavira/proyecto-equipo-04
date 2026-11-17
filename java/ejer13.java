package boletinTema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer13 {

	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int dia_salida, dia_llegada;
		int decision, hora_salida, minutos_salida, hora_llegada, minutos_llegada;
		boolean control = true;
		
		do {
		dia_salida=0;
		dia_llegada=0;
		hora_salida=0;
		minutos_salida=0;
		hora_llegada=0;
		minutos_llegada=0;
		decision=0;
		control=true;
			do {
				try {
					System.out.println("Dime el día de salida del tren:");
					dia_salida = Integer.parseInt(entrada.readLine());
					control = true;
				} catch (NumberFormatException e) {
					System.out.println("Valor no válido. Introduce un número entero.");
					control = false;
				} 
			} while (!control);
			
			do {
				try {
					System.out.println("Dime la hora de salida del tren (0-23):");
					hora_salida = Integer.parseInt(entrada.readLine());
					if (hora_salida >= 0 && hora_salida <= 23) {
						control = true;
					} else {
						System.out.println("La hora debe estar entre 0 y 23.");
						control = false;
					}
				} catch (NumberFormatException e) {
					System.out.println("Valor no válido.");
					control = false;
				}
			} while (!control);
			
			do {
				try {
					System.out.println("Dime el minuto de salida (0-59):");
					minutos_salida = Integer.parseInt(entrada.readLine());
					if (minutos_salida >= 0 && minutos_salida <= 59) {
						control = true;
					} else {
						System.out.println("El minuto debe estar entre 0 y 59.");
						control = false;
					}
				} catch (NumberFormatException e) {
					System.out.println("Valor no válido.");
					control = false;
				}
			} while (!control);
			
			do {
				try {
					System.out.println("Dime el día de llegada del tren:");
					dia_llegada = Integer.parseInt(entrada.readLine());
					control = true;
				} catch (NumberFormatException e) {
					System.out.println("Valor no válido.");
					control = false;
				}
			} while (!control);
			
			do {
				try {
					System.out.println("Dime la hora de llegada del tren (0-23):");
					hora_llegada = Integer.parseInt(entrada.readLine());
					if (hora_llegada >= 0 && hora_llegada <= 23) {
						control = true;
					} else {
						System.out.println("La hora debe estar entre 0 y 23.");
						control = false;
					}
				} catch (NumberFormatException e) {
					System.out.println("Valor no válido.");
					control = false;
				}
			} while (!control);
				
			do {
				try {
					System.out.println("Dime el minuto de llegada del tren (0-59):");
					minutos_llegada = Integer.parseInt(entrada.readLine());
					if (minutos_llegada >= 0 && minutos_llegada <= 59) {
						control = true;
					} else {
						System.out.println("El minuto debe estar entre 0 y 59.");
						control = false;
					}
				} catch (NumberFormatException e) {
					System.out.println("Valor no válido.");
					control = false;
				}
			} while (!control);
			
			
			int total_min_s = (dia_salida * 24 * 60) + (hora_salida * 60) + minutos_salida;
			int total_min_l = (dia_llegada * 24 * 60) + (hora_llegada * 60) + minutos_llegada;
			
			int diferencia_min = total_min_l - total_min_s;
			
			if (diferencia_min < 0) {
				System.out.println("Error: La fecha y hora de llegada no pueden ser anteriores a la salida.");
			} else {
				int horas_finales = diferencia_min / 60;
				int minutos_finales = diferencia_min % 60;
				
				System.out.print("El tren ha tardado en llegar a su destino: ");
				System.out.println(horas_finales + " horas y " + minutos_finales + " minutos.");
			}
			do {
				try {
					System.out.println("Deseas repetir el programa?? pulsa 1 para repetir");
					decision= Integer.parseInt(entrada.readLine());
					control = true;
				} catch (NumberFormatException e) {
					System.out.println("Valor no valido!");
					control = false;
				} 
			} while (!control); 
		} while (decision==1);
	}//fin main

}//fin ejer13