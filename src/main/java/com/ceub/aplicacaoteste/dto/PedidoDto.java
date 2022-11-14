package com.ceub.aplicacaoteste.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.ceub.aplicacaoteste.model.Pedido;


public class PedidoDto {
	private Integer numero;
	private Integer prazo_entrega;
	
	
	public PedidoDto() {
		
	}
	
	public PedidoDto(Pedido pedido) {
		this.numero = pedido.getNumero();
		this.prazo_entrega = pedido.getPrazo_entrega();
		
	}
	
	private Integer getNumero() {
		return numero;
	}
	private Integer getPrazo_entrega() {
		return prazo_entrega;
	}
	

	public static List<PedidoDto> converterPedido(List<Pedido> pedidos) {
		// TODO Auto-generated method stub
		return pedidos.stream().map(PedidoDto::new).collect(Collectors.toList());
	}

}
