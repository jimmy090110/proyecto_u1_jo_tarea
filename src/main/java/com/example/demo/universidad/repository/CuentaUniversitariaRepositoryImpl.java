package com.example.demo.universidad.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.universidad.modelo.CuentaUniversitaria;

@Repository
public class CuentaUniversitariaRepositoryImpl implements ICuentaUniversidadRepository {
	private static List<CuentaUniversitaria> baseCuentas = new ArrayList<>();
	@Override
	public CuentaUniversitaria buscarPorNumero(String numeroCuenta) {
		// TODO Auto-generated method stub
		//SELECT * FROM CUENTA C WHERE C.NUMERO = numeroCuenta
		//*Mock
		CuentaUniversitaria cuenta = new CuentaUniversitaria();
		cuenta.setNumero(numeroCuenta);
		cuenta.setSaldo(new BigDecimal(100));
		cuenta.setTipo("A");
		cuenta.setTitular("Jimmy Ortega");
		return cuenta;
		//Comentarios
	}
	@Override
	public CuentaUniversitaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void actualizar(CuentaUniversitaria cuentaUniversitaria) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertar(CuentaUniversitaria cuentaUniversitaria) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}



}
