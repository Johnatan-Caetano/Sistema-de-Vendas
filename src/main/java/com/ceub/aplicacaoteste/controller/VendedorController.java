package com.ceub.aplicacaoteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ceub.aplicacaoteste.dto.VendedorDto;
import com.ceub.aplicacaoteste.model.Vendedor;
import com.ceub.aplicacaoteste.repository.VendedorRepository;

public class VendedorController {
	@Autowired
	VendedorRepository vendedorRepository;

	@RequestMapping("/vendedores")
	public List<VendedorDto> listarVendedores(Integer cod_vendedor){
		List<Vendedor> vendedores;
		if(cod_vendedor == null) {
			vendedores = vendedorRepository.findAll();
		}else {
			vendedores = vendedorRepository.findByCod_vendedor(cod_vendedor);
		}
		return VendedorDto.converterVendedor(vendedores);
	}

	@RequestMapping("/clientes")
	public List<VendedorDto> listarVendedores(String nome) {
		List<Vendedor> vendedores;
		if (nome == null) {
			vendedores = vendedorRepository.findAll();
		} else {
			vendedores = vendedorRepository.findByNome(nome);
		}
		return VendedorDto.converterVendedor(vendedores);
	}

	@RequestMapping("/vendedores_completo")
	public List<Vendedor> listarVendedoresCompleto() {
		List<Vendedor> vendedores = vendedorRepository.findAll();
		return vendedores;
	}
}
