package br.com.Collections;

public class ControleEstoque {

	String nomep;
	String descricaop;
	double precop;
	
	public ControleEstoque(String nomep, double precop, String descricaop) {
		super();
		this.nomep = nomep;
		this.precop = precop;
		this.descricaop = descricaop;
	}

	public String getNomep() {
		return nomep;
	}

	public void setNomep(String nomep) {
		this.nomep = nomep;
	}

	public String getDescricaop() {
		return descricaop;
	}

	public void setDescricaop(String descricaop) {
		this.descricaop = descricaop;
	}

	public double getPrecop() {
		return precop;
	}

	public void setPrecop(double precop) {
		this.precop = precop;
	}

	public String toString() {
		return "\nProduto: " +"\nNome Produto: "+ this.nomep + "\nPreço Produto: " + this.precop +"\nDescrição Produto: "+ this.descricaop;
	
	}
	
	
	
}
