package com.ceub.aplicacaoteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ceub.aplicacaoteste.dto.ProdutoDto;
import com.ceub.aplicacaoteste.model.Produto;
import com.ceub.aplicacaoteste.repository.ProdutoRepository;

public class ProdutoController {
	@Autowired
	ProdutoRepository ProdutoRepository;

	@RequestMapping("/pedidos")
	public List<ProdutoDto> listarProduto(Integer cod_produto){
		List<Produto> produtos;
		if(cod_produto == null) {
			produtos = ProdutoRepository.findAll();
		}else {
			produtos = ProdutoRepository.findByCod_produto(cod_produto);
		}
		return ProdutoDto.converterProduto(produtos);
	}

	@RequestMapping("/pedidos")
	public List<ProdutoDto> listarProduto(String descricao) {
		List<Produto> produtos;
		if (descricao == null) {
			produtos = ProdutoRepository.findAll();
		} else {
			produtos = ProdutoRepository.findByDescricao(descricao);
		}
		return ProdutoDto.converterProduto(produtos);
	}

	@RequestMapping("/clientes_completo")
	public List<Produto> listarProdutosCompleto() {
		List<Produto> produtos = ProdutoRepository.findAll();
		return produtos;
	}
}
