package io.swagger.repository;

import io.swagger.repository.entity.PedidoDetalleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoDetalleRepo extends JpaRepository<PedidoDetalleEntity, Integer>{

    @Modifying
    @Query(value="DELETE FROM pedido_detalle WHERE pedido_id = ?1",nativeQuery = true)
    void deleteByPedidoId(int pedidoId);

}
