package br.com.fiap.beans;

public class Telefone {
	private String fixo;
	private String celular;
	private String comercial;
	private String contato;
	
	public Telefone() {
		super();
	}
	public Telefone(String fixo, String celular, String comercial, String contato) {
		this.fixo = fixo;
		this.celular = celular;
		this.comercial = comercial;
		this.contato = contato;
	}
	public String getFixo() {
		return fixo;
	}
	public void setFixo(String fixo) {
		this.fixo = fixo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getComercial() {
		return comercial;
	}
	public void setComercial(String comercial) {
		this.comercial = comercial;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
}
