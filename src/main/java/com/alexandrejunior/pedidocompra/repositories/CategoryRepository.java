package com.alexandrejunior.pedidocompra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrejunior.pedidocompra.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
