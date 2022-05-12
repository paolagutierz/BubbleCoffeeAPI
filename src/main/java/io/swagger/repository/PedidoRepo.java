package io.swagger.repository;

import io.swagger.repository.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepo extends JpaRepository<PedidoEntity, Integer> {
    List<PedidoEntity> findByEstado(String estado);
}
