package com.alexandrejunior.pedidocompra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrejunior.pedidocompra.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
