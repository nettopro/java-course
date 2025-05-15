package github.nettopro.exercises_sb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import github.nettopro.exercises_sb.model.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
