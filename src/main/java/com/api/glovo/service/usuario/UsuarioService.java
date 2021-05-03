package com.api.glovo.service.usuario;

import com.api.glovo.domain.Usuario;

public interface UsuarioService {
    Usuario getUsuarioLogin(String user, String password);
}
