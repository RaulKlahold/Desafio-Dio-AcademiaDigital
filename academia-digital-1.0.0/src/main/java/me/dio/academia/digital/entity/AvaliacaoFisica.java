package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {

  private Long id;

  private Aluno aluno;

  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

  private double peso;

  private double altura;

}
