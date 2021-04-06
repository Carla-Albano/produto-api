package br.com.loja.mylook.service;

import br.com.loja.mylook.entity.Product;
import br.com.loja.mylook.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    public Product saveProduct(Product product) {
        return repository.save(product);

    }
}
