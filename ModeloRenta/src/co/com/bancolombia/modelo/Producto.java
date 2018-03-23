package co.com.bancolombia.modelo;

import java.util.Calendar;
import java.util.Date;

import co.com.bancolombia.interfaces.IAlquilable;

public class Producto implements IAlquilable {
	private String codigo;
	private String titulo;
	private double precio;
	private Date fechaRetorno;
	private boolean disponible;
	
	public static final String CONSTANTE = "MiConstante";
	
	
	public Producto(String codigo, String titulo, double precio, Date fechaRetorno, boolean disponible) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.precio = precio;
		this.fechaRetorno = fechaRetorno;
		this.disponible = disponible;

	}

	@Override
	public void rentar() {
		if(this.disponible) {
			this.disponible = false;
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.MONTH, 1);
			this.fechaRetorno = cal.getTime();
		}
	}
	
	@Override
	public void devolver() {
		this.fechaRetorno = null;
		this.disponible = true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaRetorno() {
		return fechaRetorno;
	}

	public void setFechaRetorno(Date fechaRetorno) {
		this.fechaRetorno = fechaRetorno;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
