package cl.fsj.infoclub;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hola mundo,esta es mi primera clase");

		menu();

	}

	public static void menu() {
		int opcion;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("MENU: elija una opción");
			System.out.println("1. Calculadora");
			System.out.println("2. Conteo de caracteres");
			System.out.println("3. Serie de Fibonacci");
			System.out.println("4. Números pares");
			System.out.println("5. Salir");

			opcion = sc.nextInt();
		}while( opcion > 5 || opcion <1);
		
		while (opcion <5 || opcion >1) {
			if(opcion ==1) {
				calculadora();
				break;
				
			}
			else if(opcion == 2) {
				conteoChar();
				break;
			}
			else if(opcion == 3) {
				fibonacci();
				break;
			}
			else if(opcion == 4) {
				numerosPares();
				break;
			}
			else if(opcion == 5) {
				System.out.println("Hasta la bista veivi.");
				opcion = 0;
				break;
			}

			
		}
	}

	public static void calculadora() {
		double n1;
		double n2 = 0;
		String op = null;

		do {

			System.out.println("Elija una opcion (numero)");
			System.out.println("1. Suma ");
			System.out.println("2. Resta ");
			System.out.println("3. Multiplicar ");
			System.out.println("4. Dividir ");
			System.out.println("5. Salir");

			Scanner opc = new Scanner(System.in);
			op = opc.next();
			Scanner sc = new Scanner(System.in);

			if (op.contentEquals("1")) {
				System.out.println("Ingrese primer numero:");
				n1 = sc.nextDouble();
				System.out.println("Ingrese segundo numero:");
				n2 = sc.nextDouble();
				double resultado = n1 + n2;
				System.out.println("La suma de los numeros es: " + resultado);
				break;
			} else if (op.contentEquals("2")) {
				System.out.println("Ingrese primer numero:");
				n1 = sc.nextDouble();
				System.out.println("Ingrese segundo numero:");
				n2 = sc.nextDouble();
				double resultado = n1 - n2;
				System.out.println("La diferencia entre los numeros es: " + resultado);
				break;
			} else if (op.contentEquals("3")) {
				System.out.println("Ingrese primer numero:");
				n1 = sc.nextDouble();
				System.out.println("Ingrese segundo numero:");
				n2 = sc.nextDouble();
				double resultado = n1 * n2;
				System.out.println("La multiplicacion es:  " + resultado);
				break;
			} else if (op.contentEquals("4")) {
				System.out.println("Ingrese primer numero:");
				n1 = sc.nextDouble();
				System.out.println("Ingrese segundo numero:");
				n2 = sc.nextDouble();
				if (n2 != 0) {
					double resultado = n1 / n2;
					System.out.println("La division es: " + resultado);
				} else {
					System.out.println("No se puede dividir");
				}
				break;
			} else if (op.contentEquals("5")) {
				System.out.println("Usted eligio salir, Adios");
				break;
			}

		} while (!op.contentEquals("5"));

	}

//	*********** Metodo Conteo de Caracteres ************

	static void conteoChar() {
		Scanner cs = new Scanner(System.in);
		String palabra;
		System.out.println("Ingrese una frase o palabra a gusto:");
		palabra = cs.nextLine();

		System.out.println("El texto ingresado, contiene " + palabra.length() + " caracteres.");
	}

//	*********** Metodo Números Pares *************
	public static void numerosPares() {
		int n, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un parametro: ");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}

// 	*********** Metodo Fibonacci ************

	public static void fibonacci() {
		int n1 = 0, n2 = 1, n3, num, cont;
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese numero:");
		num = sc.nextInt();

		while (num < 1) {
			System.out.println("El numero ingresado no puede ser menor a 1. Ingrese otro digito.");
			num = sc.nextInt();
		}

		System.out.println("Su secuencia fibonacci es de " + num + " digitos");
		System.out.println("Es la siguiente: ");

		for (cont = 0; cont < num; cont++) {
			System.out.println(n1);
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}

}
