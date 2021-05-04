package com.api.glovo.service.restaurante;

import com.api.glovo.domain.Restaurante;

import java.util.List;

public interface RestauranteService {
    List<Restaurante> getRestaurantes();
    List<Restaurante> getRestaurantesPorCategoria(String categoria);
}
