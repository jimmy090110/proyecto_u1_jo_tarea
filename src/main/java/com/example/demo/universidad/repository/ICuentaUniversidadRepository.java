package com.example.demo.universidad.repository;

import com.example.demo.universidad.modelo.CuentaUniversitaria;

public interface ICuentaUniversidadRepository {
	//Vamos a necesitar
	public CuentaUniversitaria buscarPorNumero(String numeroCuenta);
	//public void actualizar(CuentaBancaria cuentaBancaria);
		
	//CRUD
	public CuentaUniversitaria buscar(Integer id);
	//Vamos a necesitar
	public void actualizar(CuentaUniversitaria cuentaUniversitaria);
	public void insertar(CuentaUniversitaria cuentaUniversitaria);
	public void borrar(Integer id);
	
}
