package github.nettopro.exercises_sb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import github.nettopro.exercises_sb.model.entities.Product;
import github.nettopro.exercises_sb.model.repositories.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public @ResponseBody Product newProduct(@RequestParam String name) {
        Product product = new Product(name);
        productRepository.save(product);
        return product;
    }
}
