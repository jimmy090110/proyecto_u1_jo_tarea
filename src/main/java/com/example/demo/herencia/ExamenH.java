package com.example.demo.herencia;

import java.time.LocalDateTime;

public class ExamenH {
	private String numero;
	private LocalDateTime fechaExamen;
	private ProfesorH profesor;
	private EstudianteH estudiante;
	
	public void agendar(String numero,LocalDateTime fechaExamen,EstudianteH eh,  ProfesorH ph){
		this.numero= numero;
		this.fechaExamen= fechaExamen;
		ProfesorH profesor = new ProfesorH();
		
		this.profesor= ph;
		this.guardarFecha(this);


	}
	
	private void guardarFecha(ExamenH examenH) {
		// TODO Auto-generated method stub
		System.out.println("Se ha generado la factura");
		
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
	public ProfesorH getProfesor() {
		return profesor;
	}
	public void setProfesor(ProfesorH profesor) {
		this.profesor = profesor;
	}
	public EstudianteH getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(EstudianteH estudiante) {
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
