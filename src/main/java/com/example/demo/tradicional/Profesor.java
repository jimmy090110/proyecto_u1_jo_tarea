package com.example.demo.tradicional;

public class Profesor {
	private String nombre;
	private String cedula;
	
	
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", cedula=" + cedula + ", getNombre()=" + getNombre() + ", getCedula()="
				+ getCedula() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
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
