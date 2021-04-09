package br.com.loja.mylook.controller;

import br.com.loja.mylook.entity.Product;
import br.com.loja.mylook.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/adicionar")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping ("/listar")
    public List<Product>listAllProducts(){
        return service.listProducts();
    }
}
