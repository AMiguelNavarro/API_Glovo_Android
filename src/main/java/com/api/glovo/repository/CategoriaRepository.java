package com.api.glovo.repository;

import com.api.glovo.domain.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM categorias;")
    List<Categoria> getCategorias();
}
