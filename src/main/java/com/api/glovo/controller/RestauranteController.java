package com.api.glovo.controller;

import com.api.glovo.domain.Restaurante;
import com.api.glovo.service.restaurante.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @GetMapping(value = "/restaurantes")
    public ResponseEntity<List<Restaurante>> getRestaurantes() {
        List<Restaurante> listadoRestaurantes = restauranteService.getRestaurantes();
        return new ResponseEntity<>(listadoRestaurantes, HttpStatus.OK);
    }


    @GetMapping(value = "/restaurantes/filtro")
    public ResponseEntity<List<Restaurante>> getRestaurantesPorCategoria(@RequestParam("categoria") String categoria){
        List<Restaurante> listadoRestaurantes = restauranteService.getRestaurantesPorCategoria(categoria);
        return new ResponseEntity<>(listadoRestaurantes, HttpStatus.OK);
    }

    @GetMapping(value = "/restaurantes/top10")
    public ResponseEntity<List<Restaurante>> getRestaurantesTop10() {
        List<Restaurante> listadoRestaurantes = restauranteService.getRestaurantesTop10();
        return new ResponseEntity<>(listadoRestaurantes, HttpStatus.OK);
    }

}
