package com.api.glovo.controller;

import com.api.glovo.domain.Usuario;
import com.api.glovo.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuarios")
    public ResponseEntity<Usuario> getUsuarioLogin(@RequestParam("usuario") String user, @RequestParam("password") String password){
        Usuario usuario = usuarioService.getUsuarioLogin(user, password);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

}
