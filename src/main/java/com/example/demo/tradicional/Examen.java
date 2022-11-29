package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Examen {
	private String numero;
	private LocalDateTime fechaExamen;
	private Profesor profesor;
	private Estudiante estudiante;
	
	public void agendar(String numero,LocalDateTime fechaExamen, String nombreProfesor, String cedulaProfesor, String nombreEstudainte, String cedulaEstudiante, String tipo){
		this.numero= numero;
		this.fechaExamen= fechaExamen;
		Profesor profesor = new Profesor();
		profesor.setCedula(cedulaEstudiante);
		profesor.setNombre(nombreEstudainte);
		
		this.profesor=profesor;
		if(tipo.equals("RE")) {
			EstudianteRegular  estudiateRe = new EstudianteRegular();
			estudiateRe.setCodeUCE("1111");
			estudiateRe.setTipo("RE");
			System.out.println("Estudiante Regular");
			
			this.estudiante=estudiateRe;
			
		}else {
			EstudianteIrregular estudianteIrregular = new EstudianteIrregular();
			estudianteIrregular.setCodeUCE("2222");
			estudianteIrregular.setTipo("I");
			this.estudiante=estudianteIrregular;
			System.out.println("Estudiante Irregular");
			
		}
		
		this.estudiante.setNombre(nombreEstudainte);
		this.estudiante.setCedula(cedulaEstudiante);
		this.guardarFecha(this);
		
		
	}
	
	private void guardarFecha(Examen examenF) {
		
		System.out.println(examenF);
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
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	@Override
	public String toString() {
		return "Examen [numero=" + numero + ", fechaExamen=" + fechaExamen + ", profesor=" + profesor + ", estudiante="
				+ estudiante + ", getNumero()=" + getNumero() + ", getFechaExamen()=" + getFechaExamen()
				+ ", getProfesor()=" + getProfesor() + ", getEstudiante()=" + getEstudiante() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void agendar(String string, LocalDateTime of, int i, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
