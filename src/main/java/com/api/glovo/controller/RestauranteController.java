package com.api.glovo.controller;

import com.api.glovo.domain.Restaurante;
import com.api.glovo.service.restaurante.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestauranteController {

    @Autowired
    RestauranteService restauranteService;

    @GetMapping(value = "/restaurantes")
    public ResponseEntity<List<Restaurante>> getRestaurantes() {
        List<Restaurante> listadoRestaurantes = restauranteService.getRestaurantes();
        return new ResponseEntity<>(listadoRestaurantes, HttpStatus.OK);
    }

}
