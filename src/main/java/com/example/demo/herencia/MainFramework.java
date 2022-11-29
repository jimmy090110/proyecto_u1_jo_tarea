package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {
	public static void main(String[] args) {
		
		EstudianteH estudianteI = new EstudianteH();
		estudianteI.setCedula("421341");
		estudianteI.setNombre("Jhonathan");
		estudianteI.setTipo("FA");
		
		ProfesorH profesorH = new ProfesorH();
		profesorH.setCedula("3141341");
		profesorH.setNombre("Fernando");
		
		ExamenH examen = new ExamenH();
		examen.agendar("43141", LocalDateTime.of(2022, 12,1,8,30),  estudianteI, profesorH );
		
	}

}
