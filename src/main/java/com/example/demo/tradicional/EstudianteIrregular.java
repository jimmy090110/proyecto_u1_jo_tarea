package com.example.demo.tradicional;

public class EstudianteIrregular extends Estudiante {
	private String CodeUCE;

	public String getCodeUCE() {
		return CodeUCE;
	}

	public void setCodeUCE(String codeUCE) {
		CodeUCE = codeUCE;
	}
	
	protected Integer calcularPromedio() {
		System.out.println("Promedio de 8");
		return 8;
	}
	
	

}
