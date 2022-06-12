package com.example.order.Product;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/get/all")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/get/{id}")
    public Optional<Product> getSingleProduct(@PathVariable long id){
        return productService.getSingleProduct(id);
    }

    @PostMapping("/post")
    public Product addProduct(@RequestBody Product product){
        return productService.addNewProduct(product);
    }


}
