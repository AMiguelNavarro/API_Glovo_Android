package com.api.glovo.service.restaurante;

import com.api.glovo.domain.Restaurante;
import com.api.glovo.domain.RestauranteDTO;

import java.util.List;

public interface RestauranteService {
    List<Restaurante> getRestaurantes();
    List<Restaurante> getRestaurantesPorCategoria(String categoria);
    List<Restaurante> getRestaurantesTop10();
    Restaurante addRestaurante(RestauranteDTO restaurante);
}
