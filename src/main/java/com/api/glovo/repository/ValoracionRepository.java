package com.api.glovo.repository;

import com.api.glovo.domain.Valoracion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ValoracionRepository extends CrudRepository<Valoracion, Integer> {
//"select restaurantes.nombre, AVG(valoraciones.puntuacion) as puntuacion, restaurantes.imagen from valoraciones INNER JOIN restaurantes on restaurantes.id_restaurante = valoraciones.id_restaurante GROUP BY restaurantes.nombre"
    @Query(nativeQuery = true, value = "SELECT AVG(puntuacion) as puntuacion, id_valoracion, id_restaurante, id_usuario FROM valoraciones GROUP BY id_restaurante" )
    List<Valoracion> getMediaValoraciones();

}
