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
@Table(name = "tb_matriculas")
public class Matricula {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "aluno_id")//verificar sobre as anotações e relacionamentos bi direcional
  private Aluno aluno;

  private LocalDateTime dataDaMatricula = LocalDateTime.now();

  @Override
  public String toString() {
    return "Matricula{" +
            "id=" + id +
            ", aluno=" + aluno +
            ", dataDaMatricula=" + dataDaMatricula +
            '}';
  }
}
