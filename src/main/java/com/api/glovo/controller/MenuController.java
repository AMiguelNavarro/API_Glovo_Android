package com.api.glovo.controller;

import com.api.glovo.domain.Menu;
import com.api.glovo.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {

    @Autowired
    MenuService menuService;

    @GetMapping(value = "/menus")
    public ResponseEntity<List<Menu>> getMenus(@RequestParam("idRestaurante") int idRestaurante) {
        List<Menu> listadoMenus = menuService.getMenus(idRestaurante);
        return new ResponseEntity<>(listadoMenus, HttpStatus.OK);
    }

}
