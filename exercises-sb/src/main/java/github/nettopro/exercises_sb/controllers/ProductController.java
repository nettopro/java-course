package github.nettopro.exercises_sb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import github.nettopro.exercises_sb.model.entities.Product;
import github.nettopro.exercises_sb.model.repositories.ProductRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Product newProduct(@Valid Product product) {
        productRepository.save(product);
        return product;
    }

    @GetMapping
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping(path = "/name/{substring}")
    public Iterable<Product> getProductsByName(@PathVariable String substring) {
        return productRepository.findByNameContaining(substring);
    }

    @GetMapping(path = "/{id}")
    public Optional<Product> getProductById(@PathVariable int id) {
        return productRepository.findById(id);
    }

    @GetMapping(path = "/page/{pageNumber}/{pageQuantity}")
    public Iterable<Product> getProductsByPage(@PathVariable int pageNumber, @PathVariable int pageQuantity) {
        if(pageQuantity >= 5) pageQuantity = 5;
        Pageable page = PageRequest.of(pageNumber, pageQuantity);
        return productRepository.findAll(page);
    }

/*     @PutMapping
    public Product alterProduct(Product product) {
        return productRepository.save(product);
    } */

    @DeleteMapping(path = "/{id}")
    public void deleteProduct(@PathVariable int id) {
        productRepository.deleteById(id);
    }
}
