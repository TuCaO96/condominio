package br.com.condominio.models;

public class Condominio {
	private int Id;
	private Morador Morador;
	private double Valor;
	private int Mes;
	private int Ano;
	private int Status;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public Morador getMorador() {
		return Morador;
	}
	
	public void setMorador(Morador morador) {
		Morador = morador;
	}
	
	public double getValor() {
		return Valor;
	}
	
	public void setValor(double valor) {
		Valor = valor;
	}
	
	public int getMes() {
		return Mes;
	}
	
	public void setMes(int mes) {
		Mes = mes;
	}
	
	public int getAno() {
		return Ano;
	}
	
	public void setAno(int ano) {
		Ano = ano;
	}
	
	public int getStatus() {
		return Status;
	}
	
	public void setStatus(int status) {
		Status = status;
	}
}
