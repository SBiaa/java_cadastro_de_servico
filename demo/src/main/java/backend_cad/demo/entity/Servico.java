package backend_cad.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name ="Servico")
@Data
public class Servico {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nomeCliente;
  @Temporal(TemporalType.DATE)
  private Date dataInicio=new Date();
  @Temporal (TemporalType.DATE)
  private Date dataTermino;
  private String descricaoServico;
  private Double valorPago;
  private Double valorServico;
  private Date dataPagamento;
  private String status;
}
