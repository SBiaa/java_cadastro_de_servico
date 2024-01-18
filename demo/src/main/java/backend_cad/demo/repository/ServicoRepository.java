package backend_cad.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import backend_cad.demo.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long>{
  @Query("select s from Servico s where (s.valorPago is null or s.valorPago =0) and s.status!='cancelado'")
  List<Servico> buscarServicosPagamentoPendente();

  @Query("select s from Servico s where s.status = 'cancelado'")
  List<Servico> buscarServicosCancelados();
}
