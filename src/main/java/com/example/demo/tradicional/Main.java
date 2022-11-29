package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {
		Examen examen = new Examen();
		examen.agendar("41315", LocalDateTime.of(2022, 12,1,8,30),172751510, "Jhonatan" ,  "d121423212");
		
	}

}
