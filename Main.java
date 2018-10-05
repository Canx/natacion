package natacion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Natacion natacion = new Natacion();
		
		System.out.println(natacion);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el número de alumnos: ");
		int alumnos = scanner.nextInt();
		scanner.close();
		
		System.out.println(natacion.comprobarAlumnos(alumnos));
		
	}
}
