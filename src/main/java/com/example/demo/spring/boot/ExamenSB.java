package com.example.demo.spring.boot;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
@Service

public class ExamenSB {
	private String numero;
	private LocalDateTime fechaExamen;
	private ProfesorSB profesor;
	private EstudianteSB estudiante;
	
	public void agendar(String numero,LocalDateTime fechaExamen,EstudianteSB eh,  ProfesorSB ph){
		this.numero= numero;
		this.fechaExamen= fechaExamen;
		ProfesorSB profesor = new ProfesorSB();
		
		this.profesor= ph;
		this.guardarFecha(this);


	}
	
	private void guardarFecha(ExamenSB examenH) {
		// TODO Auto-generated method stub
		System.out.println("Se ha generado Fecha de Exámen");
		
		System.out.println(examenH);
		
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFechaExamen() {
		return fechaExamen;
	}
	public void setFechaExamen(LocalDateTime fechaExamen) {
		this.fechaExamen = fechaExamen;
	}
	public ProfesorSB getProfesor() {
		return profesor;
	}
	public void setProfesor(ProfesorSB profesor) {
		this.profesor = profesor;
	}
	public EstudianteSB getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(EstudianteSB estudiante) {
		this.estudiante = estudiante;
	}

	@Override
	public String toString() {
		return "Examen [numero=" + numero + ", fechaExamen=" + fechaExamen + ", profesor=" + profesor + ", estudiante="
				+ estudiante + ", getNumero()=" + getNumero() + ", getFechaExamen()=" + getFechaExamen()
				+ ", getProfesor()=" + getProfesor() + ", getEstudiante()=" + getEstudiante() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

	

}
