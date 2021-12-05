package com.lambretapa.cursomc.domain;

public enum EstadoPagamneto {

	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;

	private EstadoPagamneto(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static EstadoPagamneto toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (EstadoPagamneto x : EstadoPagamneto.values()) {
			if (cod.equals(x.cod)) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
