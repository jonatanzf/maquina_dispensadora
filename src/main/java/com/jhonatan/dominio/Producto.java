package com.jhonatan.dominio;

public class Producto {


	private String nombre;
	private Double precio;
	private int codigo;
	private int cantidad;
	
	
	public  Producto()
	{
		this.nombre = nombre;
		this.precio = precio;
		this.codigo =codigo;
		this.cantidad = cantidad;
		
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
