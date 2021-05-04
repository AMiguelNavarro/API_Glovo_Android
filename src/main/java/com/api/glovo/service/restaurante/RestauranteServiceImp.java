package com.api.glovo.service.restaurante;

import com.api.glovo.domain.Restaurante;
import com.api.glovo.repository.RestauranteRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestauranteServiceImp implements RestauranteService{

    @Autowired
    RestauranteRepository restauranteRepository;

    @Override
    public List<Restaurante> getRestaurantes() {
        return restauranteRepository.findAll();
    }

    @Override
    public List<Restaurante> getRestaurantesPorCategoria(String categoria) {
        int idCategoria = restauranteRepository.findIdCategoriaByCategoria(categoria);
        return restauranteRepository.findRestaurantesById(idCategoria);
    }
}
