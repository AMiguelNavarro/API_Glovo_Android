package com.api.glovo.repository;

import com.api.glovo.domain.Valoracion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValoracionRepository extends CrudRepository<Valoracion, Integer> {
}
