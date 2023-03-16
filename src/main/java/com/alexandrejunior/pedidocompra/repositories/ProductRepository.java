package com.alexandrejunior.pedidocompra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrejunior.pedidocompra.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
