package com.jhonatan.app;

import java.util.ArrayList;

import com.jhonatan.dominio.Maquina;
import com.jhonatan.dominio.Producto;


public class App {

	public static void main(String[] args) {
	
		Producto galletas = new Producto();
	    galletas.setNombre("Festival");
		galletas.setPrecio(800.0);
		galletas.setCodigo(01);
		galletas.setCantidad(12);
		
		Producto chocolatina = new Producto();
		chocolatina.setNombre("jet");
		chocolatina.setPrecio(1200.0);
		chocolatina.setCodigo(02);
		chocolatina.setCantidad(12);
		ArrayList<Producto>listaProductos= new ArrayList<>();
		listaProductos.add(galletas);
		listaProductos.add(galletas);
		
		
		
		
		Maquina maquinaDispensadora = new Maquina();
		
		
		
		
		
		
		
		for(int x=0;x<listaProductos.size();x++) {
			  System.out.println(maquinaDispensadora.getProductos());
			}
		
		}


	}


