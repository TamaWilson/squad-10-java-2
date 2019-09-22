package br.com.codenation.log.entity;

import br.com.codenation.log.entity.enums.Ambiente;
import br.com.codenation.log.entity.enums.Nivel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @NotNull
    @NotBlank
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Nivel nivel;

    @NotNull
    private String payload;

    @NotNull
    private LocalDateTime dataColeta;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Ambiente ambiente;
}
