package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component 

public class EstudianteIrregularSB extends EstudianteSB {
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
