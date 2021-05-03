package com.api.glovo.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "restaurantes")
public class Restaurante {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRestaurante;
    @Column private String nombre;
    @Column private String imagen;
    @Column private String descripcion;
    @Column private int numVentas;

    // FK con la tabla categorias en la BD
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idCategoria")
    @JsonBackReference
    private Categoria categoria;

}
