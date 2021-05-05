package com.api.glovo.controller;

import com.api.glovo.domain.Categoria;
import com.api.glovo.service.categoria.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping(value = "/categorias")
    public ResponseEntity<List<Categoria>> getCategorias() {
        List<Categoria> listadoCategorias = categoriaService.getCategorias();
        return new ResponseEntity<>(listadoCategorias, HttpStatus.OK);
    }

}
