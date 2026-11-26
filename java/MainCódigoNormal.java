package ENT_Codigo;

//MAIN CÓDIGO NORMAL
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCódigoNormal {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int opcion = 0;
		int total = 0;
		float saldo = 0;
		String usuario = ("");
		String contraseña = ("");
		Padel c1 = new Padel(usuario, contraseña, saldo);
		boolean control = false;

		do {
			System.out.println("===================");
			System.out.println("1. Crear cuenta");
			System.out.println("2. Iniciar Sesión");
			System.out.println("===================");
			System.out.println("Eligé una opción:");

			do {
				try {
					opcion = Integer.parseInt(entrada.readLine());
					control = true;
				} catch (NumberFormatException e) {
					System.out.println("Opción No Valida");
					control = false;
				}
			} while (opcion == 1 || opcion == 2 || !control);

			if (opcion == 2 && usuario == ("")) {
				System.out.println("Tienes Que Crear Una Cuenta Antes");
			}

			switch (opcion) {
			case 1:
				do {
					try {
						System.out.println("Introduce El Usuario:");
						usuario = entrada.readLine();
						control = true;
					} catch (NumberFormatException e) {
						System.out.println("Opción No Valida");
						control = false;
					}
				} while (!control);
				c1.setUsuario(usuario);
				do {
					try {
						System.out.println("Introduce La Contraseña:");
						contraseña = entrada.readLine();
						control = true;
					} catch (NumberFormatException e) {
						System.out.println("Opción No Valida");
						control = false;
					}
				} while (!control);
				c1.setContraseña(contraseña);
				do {
					try {
						System.out.println("Introduce el saldo Actual(+20 Por Registro):");
						saldo = Float.parseFloat(entrada.readLine());
						control = true;
					} catch (NumberFormatException e) {
						System.out.println("Opción No Valida");
						control = false;
					}
				} while (!control);
				c1.addSaldo(saldo);
				break;

			case 2:
				System.out.println("===================");
				System.out.println("1. Añadir Saldo");
				System.out.println("2. Comprar");
				System.out.println("==================");
				do {
					try {
						System.out.println("Eligé una opción:");
						opcion = Integer.parseInt(entrada.readLine());
						control = true;
					} catch (NumberFormatException e) {
						System.out.println("Opción No Valida");
						control = false;
					}
				} while (opcion == 1 || opcion == 2 || !control);

				switch (opcion) {
				case 1:
					System.out.println("Introduce El Saldo A Añadir:");
					saldo = Float.parseFloat(entrada.readLine());
					c1.addSaldo(saldo);
					break;
				case 2:
					do {
						System.out.println("====== CATÁLOGO =======");
						System.out.println("1. Pala Bullpadel 120€");
						System.out.println("2. Bote 3 Pelotas 6€");
						System.out.println("3. Zapatillas Asics 85€");
						System.out.println("=======================");
						System.out.println("Eligé una opción:");
						do {
							try {
								opcion = Integer.parseInt(entrada.readLine());
								control = true;
							} catch (NumberFormatException e) {
								System.out.println("Opción No Valida");
								control = false;
							}
						} while (opcion == 1 || opcion == 2 || opcion == 3 || !control);
						if (opcion == 1) {
							total += 120;
						} else if (opcion == 2) {
							total += 6;
						} else if (opcion == 3) {
							total += 85;
						}
						if (total > 150) {
							total /= 20;
						}
						do {
							try {
								System.out.println("Desea Seguir Comprando Pulse 1 (0. No:");
								opcion = Integer.parseInt(entrada.readLine());
								control = true;
							} catch (NumberFormatException e) {
								System.out.println("Opción No Valida");
								control = false;
							}
						} while (opcion == 1 || opcion == 0 || !control);
					} while (opcion == 1 || !control);

					System.out.println("===== Menú =====");
					System.out.println("1. Realizar Compra");
					System.out.println("2. Salir");
					System.out.println("================");
					do {
						try {
							System.out.println("Eligé una opción:");
							opcion = Integer.parseInt(entrada.readLine());
							control = true;
						} catch (NumberFormatException e) {
							System.out.println("Opción No Valida");
							control = false;
						}
					} while (opcion == 1 || opcion == 2 || !control);

					switch (opcion) {
					case 1:
						System.out.println("Total: " + total);
						System.out.println("Saldo: " + saldo);
						do {
							try {
								System.out.println("Introduce La Cantidad A Desembolsar");
								saldo = Float.parseFloat(entrada.readLine());
								control = true;
							} catch (NumberFormatException e) {
								System.out.println("Opción No Valida");
								control = false;
							}
						} while (!control);
						if (saldo == total) {
							System.out.println("Compra Realizada");
							saldo -= total;
							c1.setSaldo(saldo);
						} else {
							System.out.println("Total: " + total);
							System.out.println("Saldo: " + saldo);
							do {
								try {
									System.out.println("Añade Saldo O Introduce La Cantidad Adecuada");
									saldo = Float.parseFloat(entrada.readLine());
									control = true;
								} catch (NumberFormatException e) {
									System.out.println("Opción No Valida");
									control = false;
								}
							} while (!control);
							c1.setSaldo(saldo);
						}
						break;
					case 2:
						System.out.println("Hasta La Proxima");
						break;
					}
				}
				break;
			}
			if (opcion != 2)
				do {
					try {
						System.out.println("0. Si Desea Seguir Comprando (1. Salir)");
						opcion = Integer.parseInt(entrada.readLine());
						control = true;
					} catch (NumberFormatException e) {
						System.out.println("Opción No Valida");
						control = false;
					}
				} while (opcion == 1 || opcion == 0 || !control);
		} while (opcion == 1 || !control);
		System.out.println("Hasta La Proxima");
	}

}
