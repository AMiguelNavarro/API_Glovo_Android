package com.api.glovo.service.restaurante;

import com.api.glovo.domain.Restaurante;
import com.api.glovo.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteServiceImp implements RestauranteService{

    @Autowired
    RestauranteRepository restauranteRepository;

    @Override
    public List<Restaurante> getRestaurantes() {
        return restauranteRepository.findAll();
    }
}
