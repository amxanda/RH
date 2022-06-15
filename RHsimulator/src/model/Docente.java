package model;

public class Docente extends Funcionario {
	// atributos
	private int siape;
	private String areaVinculada;

	public Docente(String nome, String cpf) {
		super(nome, cpf);
	}

	// set
	public void setSiape(int siape) {
		this.siape = siape;
	}

	public void setAreaVinculada(String area) {
		this.areaVinculada = area;
	}

	// get
	public int getSiape() {
		return this.siape;
	}

	public String getAreaVinculada() {
		return this.areaVinculada;
	}

	public double calculaSalario(double salario) {
		double result = 0;

		if (titulacao.equals("Mestre") || titulacao.equals("mestre")) {
			result = salario + (salario * 0.20);
		} else if (titulacao.equals("Doutor") || titulacao.equals("doutor")) {
			result = salario + (salario * 0.40);
		}

		return result;
	}
}
