package com.api.glovo.repository;

import com.api.glovo.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    Usuario findByUsuarioAndPassword(String usuario, String password);

}
