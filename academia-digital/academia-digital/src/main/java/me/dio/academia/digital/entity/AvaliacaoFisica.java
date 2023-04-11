package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data //cria os getters e setter
@NoArgsConstructor //Criar um contrutor vazio automaticamente
@AllArgsConstructor //construtor com todos os atributos
@Entity
@Table(name = "tb_avalizacoes")
public class AvaliacaoFisica {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "aluno_id")
  private Aluno aluno;

  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

  @Column(name = "peso_atual")
  private double peso;

  @Column(name = "altura_atual")
  private double altura;

  @Override
  public String toString() {
    return "AvaliacaoFisica{" +
            "id=" + id +
            ", aluno=" + aluno +
            ", dataDaAvaliacao=" + dataDaAvaliacao +
            ", peso=" + peso +
            ", altura=" + altura +
            '}';
  }
}
