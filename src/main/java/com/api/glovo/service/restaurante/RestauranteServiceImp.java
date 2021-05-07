package com.api.glovo.service.restaurante;

import com.api.glovo.domain.Categoria;
import com.api.glovo.domain.Restaurante;
import com.api.glovo.domain.RestauranteDTO;
import com.api.glovo.repository.CategoriaRepository;
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

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<Restaurante> getRestaurantes() {
        return restauranteRepository.findAll();
    }

    @Override
    public List<Restaurante> getRestaurantesPorCategoria(String categoria) {
        int idCategoria = restauranteRepository.findIdCategoriaByCategoria(categoria);
        return restauranteRepository.findRestaurantesById(idCategoria);
    }

    @Override
    public List<Restaurante> getRestaurantesTop10() {
        return restauranteRepository.findRestaurantesTop10();
    }

    @Override
    public Restaurante addRestaurante(RestauranteDTO restauranteDTO) {

        Categoria categoria = categoriaRepository.findByCategoria(restauranteDTO.getNombreCategoria());

        Restaurante nuevoRestaurante = new Restaurante();
        nuevoRestaurante.setNombre(restauranteDTO.getNombre());
        nuevoRestaurante.setDescripcion(restauranteDTO.getDescripcion());
        nuevoRestaurante.setCategoria(categoria);
        nuevoRestaurante.setImagen("https://cdn.otstatic.com/legacy-cw/default2-original.png");
        nuevoRestaurante.setNumVentas(0);

        return restauranteRepository.save(nuevoRestaurante);
    }
}
