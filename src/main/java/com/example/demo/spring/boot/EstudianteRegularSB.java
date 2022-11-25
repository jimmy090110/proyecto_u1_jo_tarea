package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component 


public class EstudianteRegularSB extends EstudianteSB{
	private String CodeUCE;

	public String getCodeUCE() {
		return CodeUCE;
	}

	public void setCodeUCE(String codeUCE) {
		this.CodeUCE = codeUCE;
	}

	


	

}
