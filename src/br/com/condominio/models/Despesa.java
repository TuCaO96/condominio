package br.com.condominio.models;

public class Despesa {
	private int Id;
	private TipoDespesa TipoDespesa;
	private double Valor;
	private int Mes;
	private int Ano;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public TipoDespesa getTipoDespesa() {
		return TipoDespesa;
	}
	
	public void setTipoDespesa(TipoDespesa tipoDespesa) {
		TipoDespesa = tipoDespesa;
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
}
