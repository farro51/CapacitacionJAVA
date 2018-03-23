package co.com.bancolombia.facade;

import java.util.List;

import co.com.bancolombia.modelo.Producto;

public interface IProducto {

	public Producto obtenerProducto(String codigo);
	
	public void guardarProducto(Producto p);
	
	public List<Producto> obtenerProductos();
	
	public List<Producto> obtenerProductos(boolean disponible);
}
