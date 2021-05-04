package com.api.glovo.repository;

import com.api.glovo.domain.Restaurante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestauranteRepository extends CrudRepository<Restaurante, Integer> {

    List<Restaurante> findAll();

    @Query(name = "buscarIdCategoria", value = "SELECT id_categoria FROM categorias WHERE categoria = :categoria", nativeQuery = true)
    int findIdCategoriaByCategoria(String categoria);

    @Query(name = "buscarRestaurantesPorIdCategoria", value = "SELECT * FROM restaurantes WHERE id_categoria = :idCategoria", nativeQuery = true)
    List<Restaurante> findRestaurantesById(int idCategoria);

    @Query(nativeQuery = true, value = "SELECT * FROM restaurantes ORDER BY num_ventas DESC LIMIT 10")
    List<Restaurante> findRestaurantesTop10();

}
