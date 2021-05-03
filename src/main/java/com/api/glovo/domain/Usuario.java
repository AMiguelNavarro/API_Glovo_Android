package com.api.glovo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "usuarios")
public class Usuario {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column private String nombre;
    @Column private String apellido;
    @Column private String email;
    @Column private String usuario;
    @Column private String password;

}
