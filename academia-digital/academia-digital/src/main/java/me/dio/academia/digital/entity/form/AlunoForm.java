package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank(message = "Prencha o campo corretamente")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa ser entre {min} e {max} caracteres.")
  private String nome;

  @NotBlank(message = "Prencha o campo corretamente")
  //@CPF(message = "'${validatedValue}' é invalido")
  private String cpf;

  @NotBlank(message = "Prencha o campo corretamente")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa ser entre {min} e {max} caracteres.")
  private String bairro;

  private LocalDate dataDeNascimento;
}
