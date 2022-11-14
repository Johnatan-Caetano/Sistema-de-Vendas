package com.ceub.aplicacaoteste.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.ceub.aplicacaoteste.model.Cliente;
import com.ceub.aplicacaoteste.model.Produto;

public class ProdutoDto {
	private Integer cod_produto;
	private String descricao;
	private float valor;
	
	public ProdutoDto() {
		
	}
	
	public ProdutoDto(Produto produto) {
		this.cod_produto = produto.getCod_produto();
		this.descricao = produto.getDescricao();
		this.valor = produto.getValor();
	}
	
	public Integer getCod_produto() {
		return cod_produto;
	}
	public String getDescricao() {
		return descricao;
	}
	private float getValor() {
		return valor;
	}

	public static List<ProdutoDto> converterProduto(List<Produto> produtos) {
		// TODO Auto-generated method stub
		return produtos.stream().map(ProdutoDto::new).collect(Collectors.toList());
	}

}
