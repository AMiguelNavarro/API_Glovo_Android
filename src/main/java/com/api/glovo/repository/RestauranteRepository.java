package com.api.glovo.repository;

import com.api.glovo.domain.Restaurante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestauranteRepository extends CrudRepository<Restaurante, Integer> {

    List<Restaurante> findAll();

}
