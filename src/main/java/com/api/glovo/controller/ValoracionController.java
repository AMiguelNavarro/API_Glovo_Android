package com.api.glovo.controller;

import com.api.glovo.domain.Valoracion;
import com.api.glovo.service.valoracion.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValoracionController {

    @Autowired
    ValoracionService valoracionService;

    @GetMapping(value = "/valoraciones")
    public ResponseEntity<List<Valoracion>> getValoraciones() {
        List<Valoracion> listadoValoraciones = valoracionService.getMediaValoraciones();
        return new ResponseEntity<>(listadoValoraciones, HttpStatus.OK);
    }

}
