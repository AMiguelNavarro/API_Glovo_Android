package com.api.glovo.service.menu;

import com.api.glovo.domain.Menu;
import com.api.glovo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImp implements MenuService{

    @Autowired
    MenuRepository menuRepository;

    @Override
    public List<Menu> getMenus(int idRestaurante) {
        return menuRepository.getMenus(idRestaurante);
    }
}
