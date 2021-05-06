package com.api.glovo.service.menu;

import com.api.glovo.domain.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getMenus(int idRestaurante);
}
