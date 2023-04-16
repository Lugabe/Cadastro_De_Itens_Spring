package Mudi.mudi.repository;

import Mudi.mudi.model.Pedido;
import Mudi.mudi.model.statusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
     List<Pedido> findByStatus(statusPedido status);
}
