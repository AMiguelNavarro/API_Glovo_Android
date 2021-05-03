package com.api.glovo.service.usuario;

import com.api.glovo.domain.Usuario;
import com.api.glovo.repository.UsuarioRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario getUsuarioLogin(String user, String password) {
        val usuarioIntroducido = usuarioRepository.findByUsuarioAndPassword(user, password);
        return usuarioIntroducido;
    }

}
