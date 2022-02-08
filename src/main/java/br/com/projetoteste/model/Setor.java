package br.com.projetoteste.model;

public enum Setor {
	
	MERCEARIA(1,"MERCEARIA BÁSICA"), 
	BEBIDAS(2,"BEBIDAS"), 
	DOCERIA(3,"DOCERIA"), 
	AÇOUGUE(4,"AÇOUGUE");
	
	private int code;
	private String description;
	
	private Setor(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	
	

	
}
