package com.example.order.Product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getSingleProduct(long id){
        return productRepository.findById(id);
    }

    public Product addNewProduct(Product product){
        if(productRepository.findByNameOfProduct(product.getNameOfProduct()).isPresent())
            return null;
        else return productRepository.save(product);
    }

}



