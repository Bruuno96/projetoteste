package br.com.projetoteste.model;

public enum Marca {
	
	NESTLE(1,"NESTLÉ"),
	LACTA(2,"LACTA"),
	CAMIL(3,"ARROZ CAMIL"),
	PRATOFINO(4,"ARROZ PRATO FINO"),
	BUDWEISER(5,"CERVEJA BUDWEISER "),
	EISENBAHN(6,"CERVEJA EISENBAHN"),
	DOLLY(7,"REFRIGERANTE DOLLY"),
	COCACOLA(8,"REFRIGERANTE COCA-COLA"),
	DONABENTA(9,"FARIA DE TRIGO DONA BENTA"),
	TIOJOAO(10,"FEIJÃO TIO JOÃO"),
	FRIBOI(11,"CARNE FRIBOI");
	
	private int code;
	private String description;
	
	private Marca(int code, String description) {
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
