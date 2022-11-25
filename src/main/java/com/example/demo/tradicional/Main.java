package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {
		Examen examen = new Examen();
		examen.agendar("12345", LocalDateTime.of(2022, 12,1,8,30), "Ingeniero Pablo", "000000000", "Estudiante Victor", "100011111", "RE");
		
	}

}
