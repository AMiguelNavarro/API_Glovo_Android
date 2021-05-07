package com.api.glovo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RestauranteDTO {

    private String nombre;
    private String descripcion;
    private String nombreCategoria;

}
