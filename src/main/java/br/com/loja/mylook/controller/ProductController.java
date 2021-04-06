package br.com.loja.mylook.controller;

import br.com.loja.mylook.entity.Product;
import br.com.loja.mylook.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/adicionar-produto")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }
}
