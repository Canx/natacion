package natacion;

public class Natacion {
	String[] nombreDias = {"Lunes    ", "Martes   ", "Miércoles", "Jueves   ", "Viernes  "};
	int dias = 5;
	int horas_dia = 4;
	int[][] clases;
	int minAlumnos = 10;
	int maxAlumnos = 20;
	
	
	public Natacion() {
		this.init();
	}

	public void init() {
		this.clases = new int[this.dias][this.horas_dia];
		for (int dia = 0; dia < this.dias; dia++){
			for (int hora = 0; hora < this.horas_dia; hora++) {
				this.clases[dia][hora] = (int) (Math.random() * (maxAlumnos-minAlumnos+1)) + minAlumnos;
			}	
		}
	}
	
	public int totalAlumnosDia(int numdia) {
		int total = 0;
		for (int hora = 0; hora < this.horas_dia; hora++) {
			total += this.clases[numdia][hora];
		}	
		return total;
	}

	private int totalAlumnosHora(int hora) {
		int total = 0;
		for (int dia = 0; dia < this.dias; dia++) {
			total += this.clases[dia][hora];
		}	
		return total;
	}
	
	private int mediaAlumnosHora(int hora) {
		int total = 0;
		for (int dia = 0; dia < this.dias; dia++) {
			total += this.clases[dia][hora];
		}	
		return total / this.dias;
	}
	
	public String comprobarAlumnos(int numAlumnos) {
		String output = "";
		
		for (int dia = 0; dia < this.dias; dia++){
			for (int hora = 0; hora < this.horas_dia; hora++) {
				if (this.clases[dia][hora] == numAlumnos) {
					output += "El " + this.nombreDias[dia] + " a " + (hora+1) + "a hora.\n";
				}
			}
		}
		if (output.isEmpty()) {
			return "No hay ninguna clase con ese número de alumnos.";
		}
		return output;
	}
	
	@Override
	public String toString() {
		String output = "";
		for (int dia = 0; dia < this.dias; dia++){
			output += this.nombreDias[dia] + ":";
			for (int hora = 0; hora < this.horas_dia; hora++) {
				output += this.clases[dia][hora] + " ";
			}
			output += "Total:" + totalAlumnosDia(dia);
			output += "\n";
		}
		output += "Total    :";
		for (int hora = 0; hora< this.horas_dia; hora++) {
			output += this.totalAlumnosHora(hora) + " ";
		}
		output += "\nMedia    :";
		for (int hora = 0; hora< this.horas_dia; hora++) {
			output += this.mediaAlumnosHora(hora) + " ";
		}
		
		return output;
	}

	


	
	
}
