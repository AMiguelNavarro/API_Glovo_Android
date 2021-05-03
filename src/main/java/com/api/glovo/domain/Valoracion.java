package com.api.glovo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "valoraciones")
public class Valoracion {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idValoracion;
    @Column private int puntuacion;

    // FK con la tabla restaurantes en la BD
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idRestaurante")
    private Restaurante restaurante;

    // FK con la tabla usuarios en la BD
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

}
