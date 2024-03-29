package com.sena.proyectoSena.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sena.proyectoSena.service.ProductService;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.sena.proyectoSena.entity.Product;

import java.util.List;



@RestController
@RequestMapping("api/product")
public class ProductController {
    
    @Autowired
    ProductService productService;

    @GetMapping("/findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }
}
