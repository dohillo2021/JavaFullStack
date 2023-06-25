package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

/*Essa classe Disciplina servirá para todos os objetos e instancias de notas e disciplinas*/
public class Disciplina {

	/*Cada disciplina terá 4 notasdurante o ano inteiro*/
	private double[] nota = new double[4];
	
	
	private String disciplina;

	private double nota2;
	private String disciplina2;

	private double nota3;
	private String disciplina3;

	private double nota4;
	private String disciplina4;

	// Setters e Getters
	

	public String getDisciplina() {
		return disciplina;
	}

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getMediaNotas() {
		double somaTotal = 0;
		for (int pos = 0; pos < nota.length; pos ++) {
			somaTotal += nota[pos];
		}
		return somaTotal / 4;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(disciplina, disciplina2, disciplina3, disciplina4, nota2, nota3, nota4);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina) && Objects.equals(disciplina2, other.disciplina2)
				&& Objects.equals(disciplina3, other.disciplina3) && Objects.equals(disciplina4, other.disciplina4)
				&& Arrays.equals(nota, other.nota)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3)
				&& Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4);
	}

	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

}
