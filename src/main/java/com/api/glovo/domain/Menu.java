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
@Entity(name = "menus")
public class Menu {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMenu;
    @Column private double precio;
    @Column private String primero;
    @Column private String segundo;
    @Column private String postre;
    @Column private String nombreMenu;
    @Column private String imagenMenu;
    @Column private String bebida;

    // FK con la tabla restaurante en la BD
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "idRestaurante")
    private Restaurante restaurante;

}
