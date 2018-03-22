package co.com.bancolombia.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Persona {
	private Date fechaAfiliacion;
	private boolean activo;
	private double debito;
	private List<Producto> productos;
	
	
	public Cliente(Date fechaAfiliacion2, boolean activo, double debito) {
		super();
		this.fechaAfiliacion = fechaAfiliacion2;
		this.activo = activo ;
		this.debito = debito;
		this.productos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}


	public Date getFechaAfiliacion() {
		return fechaAfiliacion;
	}


	public void setFechaAfiliacion(Date fechaAfiliacion) {
		this.fechaAfiliacion = fechaAfiliacion;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	public double getDebito() {
		return debito;
	}


	public void setDebito(double debito) {
		this.debito = debito;
	}


	public List<Producto> getProductos() {
		return productos;
	}
	
	

}
