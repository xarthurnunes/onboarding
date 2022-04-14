package br.com.hydrasystems.onboarding.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TB_Onboarding")
@Getter
@Setter
@NoArgsConstructor
public class OrdemDeServico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   
    @NotBlank
    private String nomeFuncionario;
    @NotBlank
    private String loginFuncionario;
    @NotBlank
    private String necessidadeEquipamento;
    @Column(columnDefinition="TEXT")
    private String observacao;
    @NotBlank
    private String squad;
    @NotBlank
    private String funcao;
    
    
    @JsonFormat(pattern = "dd-MM-yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dataInicio;
    

}
