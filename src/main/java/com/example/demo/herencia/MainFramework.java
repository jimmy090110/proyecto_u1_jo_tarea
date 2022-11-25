package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {
	public static void main(String[] args) {
		
		EstudianteH estudianteI = new EstudianteH();
		estudianteI.setCedula("3141341");
		estudianteI.setNombre("Pedro");
		estudianteI.setTipo("IR");
		
		ProfesorH profesorH = new ProfesorH();
		profesorH.setCedula("3141341");
		profesorH.setNombre("Armando");
		
		ExamenH examen = new ExamenH();
		examen.agendar("12345", LocalDateTime.of(2022, 12,1,8,30),  estudianteI, profesorH );
		
	}

}
