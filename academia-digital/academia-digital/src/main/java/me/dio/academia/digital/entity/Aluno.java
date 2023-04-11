package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data //cria os getters e setter
@NoArgsConstructor //Criar um contrutor vazio automaticamente
@AllArgsConstructor //construtor com todos os atributos
@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class
Aluno {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  @Column(unique = true)
  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;

  @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY) //preguiçoso - quando solicitado uma informação carregara tudo do aluno menos a avaliacao fisica, performace
  @JsonIgnore
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

  @Override
  public String toString() {
    return "Aluno{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            ", bairro='" + bairro + '\'' +
            ", dataDeNascimento=" + dataDeNascimento +
            ", avaliacoes=" + avaliacoes +
            '}';
  }
}
