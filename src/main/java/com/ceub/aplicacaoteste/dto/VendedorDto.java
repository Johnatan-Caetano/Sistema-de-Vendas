package com.ceub.aplicacaoteste.dto;

import java.util.List;
import java.util.stream.Collectors;


import com.ceub.aplicacaoteste.model.Vendedor;

public class VendedorDto {
	private Integer cod_vendedor;
	private String nome;
	
	
	public VendedorDto() {
		
	}
	
	public VendedorDto(Vendedor vendedor) {
		this.cod_vendedor = vendedor.getCod_vendedor();
		this.nome = vendedor.getNome();
		
	}
	
	private Integer getCod_vendedor() {
		return cod_vendedor;
	}
	private String getNome() {
		return nome;
	}
	

	public static List<VendedorDto> converterVendedor(List<Vendedor> vendedores) {
		// TODO Auto-generated method stub
		return vendedores.stream().map(VendedorDto::new).collect(Collectors.toList());
	}

}
