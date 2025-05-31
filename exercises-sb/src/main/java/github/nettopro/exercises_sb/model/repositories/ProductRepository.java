package github.nettopro.exercises_sb.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import github.nettopro.exercises_sb.model.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    public Iterable<Product> findByNameContaining(String substring);
}
