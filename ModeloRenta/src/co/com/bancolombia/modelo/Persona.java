package co.com.bancolombia.modelo;

import java.util.Date;

public class Persona {
	protected int identificacion;
	private String nombres;
	private Date fechaNacimiento;
	
	//Constructor
	public Persona() {
		fechaNacimiento = new Date();
	}
	
	/*
	 * 
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	/**
	 * 
	 * @param fechaNacimiento
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombres() {
		return nombres;
	}
	
	

}
