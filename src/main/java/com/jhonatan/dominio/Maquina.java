package com.jhonatan.dominio;

public class Maquina {
	

	private String nombre;
	private Double precio;
	private int codigo;

	private int cantidad_unidades;
	private Producto productos;
	
	
	public void sacar_producto()
	{
		
		this.cantidad_unidades= cantidad_unidades;
		this.nombre=nombre;
		
	}
	
	public void ingresar_producto(Producto productos)
	{
	this.productos = productos;
		
		
		
	}
	
	public void consultar_nombre_productoAgotado()
	{
		
		
	}
	
	public void consultar_totalUnidades_productoDeterminado()
	{
		
		
	}
	
	public void consultar_totalUnidades_todoslosProductos()
	{
		
		
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

	

	
	public int getCantidad_unidades() {
		return cantidad_unidades;
	}

	public void setCantidad_unidades(int cantidad_unidades) {
		this.cantidad_unidades = cantidad_unidades;
	}

	public Producto getProductos() {
		this.productos = productos;
		return productos;
		
	}

	public void setProductos(Producto productos) {
		this.productos = productos;
	}

	

}
