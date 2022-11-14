package com.ceub.aplicacaoteste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceub.aplicacaoteste.model.Cliente;
import com.ceub.aplicacaoteste.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Integer>{

	List<Pedido> findByNumero(Integer numero);

	List<Pedido> findByPrazo_entrega(Integer prazo_entrega);

	List<Pedido> findByCliente(Cliente cliente);

	

}
