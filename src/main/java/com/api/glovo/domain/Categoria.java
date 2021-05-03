package com.api.glovo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "categorias")
public class Categoria {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
    @Column
    private String categoria;

    @OneToMany(mappedBy = "categoria")
    private List<Restaurante> listadoRestaurantes;

}
