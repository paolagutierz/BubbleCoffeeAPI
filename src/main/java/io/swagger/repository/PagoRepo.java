package io.swagger.repository;


import io.swagger.repository.entity.PagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepo extends JpaRepository<PagoEntity, Integer> {

}
