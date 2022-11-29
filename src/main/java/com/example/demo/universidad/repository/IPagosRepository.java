package com.example.demo.universidad.repository;

import com.example.demo.universidad.modelo.Pagos;

public interface IPagosRepository {
	
	
	//CRUD
		public Pagos buscar(Integer id);
		//Vamos a necesitar
		public void actualizar(Pagos pagos);
		public void insertar(Pagos pagos);
		public void borrar(Integer id);
		
}
//ctrl+shif+o para importar