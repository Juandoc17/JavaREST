package com.example.demo;

import java.util.Date;

public class Empleado {

	
	
	private String Nombres;
	private String Apellidos;
	private String TipoDeDocumento;
	private String NumeroDeDocumento;
	private Date FechaDeNacimiento;
	private Date FechaDeVinculacion;
	private String cargo;
	private Double Salario;
	private String tiempoVinculacion;
	private String edad;
	
	
	public Empleado(String nombres, String apellidos, String tipoDeDocumento, String numeroDeDocumento,
			Date fechaDeNacimiento, Date fechaDeVinculacion, String cargo, Double salario, String tiempoVinculacion,
			String edad) {
		super();
		Nombres = nombres;
		Apellidos = apellidos;
		TipoDeDocumento = tipoDeDocumento;
		NumeroDeDocumento = numeroDeDocumento;
		FechaDeNacimiento = fechaDeNacimiento;
		FechaDeVinculacion = fechaDeVinculacion;
		this.cargo = cargo;
		Salario = salario;
		this.tiempoVinculacion = tiempoVinculacion;
		this.edad = edad;
	}
	
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getTipoDeDocumento() {
		return TipoDeDocumento;
	}
	public void setTipoDeDocumento(String tipoDeDocumento) {
		TipoDeDocumento = tipoDeDocumento;
	}
	public String getNumeroDeDocumento() {
		return NumeroDeDocumento;
	}
	public void setNumeroDeDocumento(String numeroDeDocumento) {
		NumeroDeDocumento = numeroDeDocumento;
	}
	public Date getFechaDeNacimiento() {
		return FechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		FechaDeNacimiento = fechaDeNacimiento;
	}
	public Date getFechaDeVinculacion() {
		return FechaDeVinculacion;
	}
	public void setFechaDeVinculacion(Date fechaDeVinculacion) {
		FechaDeVinculacion = fechaDeVinculacion;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Double getSalario() {
		return Salario;
	}
	public void setSalario(Double salario) {
		Salario = salario;
	}
	public String getTiempoVinculacion() {
		return tiempoVinculacion;
	}
	public void setTiempoVinculacion(String tiempoVinculacion) {
		this.tiempoVinculacion = tiempoVinculacion;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado [Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", TipoDeDocumento=" + TipoDeDocumento
				+ ", NumeroDeDocumento=" + NumeroDeDocumento + ", FechaDeNacimiento=" + FechaDeNacimiento
				+ ", FechaDeVinculacion=" + FechaDeVinculacion + ", cargo=" + cargo + ", Salario=" + Salario
				+ ", tiempoVinculacion=" + tiempoVinculacion + ", edad=" + edad + "]";
	}
	
	
}
