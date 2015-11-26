package br.univel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cliente {


	private final StringProperty codigo = new SimpleStringProperty();
	private final StringProperty nome = new SimpleStringProperty();

	public String getCodigo() {
		return codigo.get();
	}

	public void setCodigo(String codigo) {
		this.codigo.set(codigo);
		
	}

	public StringProperty codigoproperty(){
		return codigo;
	}
	
	public String getNome() {
		return nome.get();
	}

	public void setNome(String nome) {
		this.nome.set(nome);
		
	}
	public StringProperty nomeproperty(){
		return nome;
	}

}
