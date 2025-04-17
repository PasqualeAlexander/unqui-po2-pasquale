package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private  String direccion;
	private  ArrayList<Producto> productos;

	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public void agregarProducto(Producto unProducto) {
		this.productos.add(unProducto);
	}
	
	public double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto producto : productos) {
			precioTotal += producto.precio;
		}
		return precioTotal;
	}
	
}
