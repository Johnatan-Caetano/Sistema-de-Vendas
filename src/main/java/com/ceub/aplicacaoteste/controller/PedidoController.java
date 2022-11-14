package com.ceub.aplicacaoteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ceub.aplicacaoteste.dto.PedidoDto;
import com.ceub.aplicacaoteste.model.Pedido;
import com.ceub.aplicacaoteste.repository.PedidoRepository;

public class PedidoController {

	@Autowired
	PedidoRepository PedidoRepository;

	@RequestMapping("/pedidos")
	public List<PedidoDto> listarPedido(Integer numero){
		List<Pedido> pedidos;
		if(numero == null) {
			pedidos = PedidoRepository.findAll();
		}else {
			pedidos = PedidoRepository.findByNumero(numero);
		}
		return PedidoDto.converterPedido(pedidos);
	}

	@RequestMapping("/pedidos")
	public List<PedidoDto> listarPedidos(Integer prazo_entrega) {
		List<Pedido> pedidos;
		if (prazo_entrega == null) {
			pedidos = PedidoRepository.findAll();
		} else {
			pedidos = PedidoRepository.findByPrazo_entrega(prazo_entrega);
		}
		return PedidoDto.converterPedido(pedidos);
	}

	@RequestMapping("/clientes_completo")
	public List<Pedido> listarPedidosCompleto() {
		List<Pedido> pedidos = PedidoRepository.findAll();
		return pedidos;
	}
}
