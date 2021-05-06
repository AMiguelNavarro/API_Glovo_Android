package com.api.glovo.repository;

import com.api.glovo.domain.Menu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM menus WHERE id_restaurante = :idRestaurante")
    List<Menu> getMenus(int idRestaurante);
}
