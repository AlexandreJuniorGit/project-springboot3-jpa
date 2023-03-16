package com.alexandrejunior.pedidocompra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrejunior.pedidocompra.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
