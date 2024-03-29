package com.sena.proyectoSena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.sena.proyectoSena.entity.Product;

@Repository


public interface ProductRepository extends JpaRepository<Product,Long>{


    
}
