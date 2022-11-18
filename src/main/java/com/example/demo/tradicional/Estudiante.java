package com.example.demo.tradicional;

public class Estudiante {

	private String nombre;
	private String cedula;
	private String tipo;
	
	
	

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", cedula=" + cedula + ", tipo=" + tipo + ", getTipo()=" + getTipo()
				+ ", getNombre()=" + getNombre() + ", getCedula()=" + getCedula() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
}
