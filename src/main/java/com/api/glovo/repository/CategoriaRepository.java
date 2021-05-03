package com.api.glovo.repository;

import com.api.glovo.domain.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
}
