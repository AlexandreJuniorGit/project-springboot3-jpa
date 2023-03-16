package com.alexandrejunior.pedidocompra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrejunior.pedidocompra.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
