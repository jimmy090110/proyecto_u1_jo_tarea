package com.example.demo.herencia;

public class EstudianteIrregularH extends EstudianteH {
	private String CodeUCE;

	public String getCodeUCE() {
		return CodeUCE;
	}

	public void setCodeUCE(String codeUCE) {
		CodeUCE = codeUCE;
	}
	protected Integer calcularPromedio() {
		System.out.println("Promedio de 7");
		return 7;
	}
	
	

}
