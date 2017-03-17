package main;

public class Concurso {
	private static int concursosCadastrados;
	private String name;
	private int id;
	private String edital;
	private Servidor supervisor;

	Concurso() {
		concursosCadastrados++;
		supervisor = new Servidor();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getEdital() {
		return edital;
	}

	public void setEdital(String edital) {
		this.edital = edital;
	}

	public Servidor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Servidor supervisor) {
		this.supervisor = supervisor;
	}

	public static int getConcursosCadastrados() {
		return concursosCadastrados;
	}


}
