package io.swagger.repository;

import io.swagger.repository.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<ProductoEntity, Integer> {

    List<ProductoEntity> findByCategoria(String categoria);
}
