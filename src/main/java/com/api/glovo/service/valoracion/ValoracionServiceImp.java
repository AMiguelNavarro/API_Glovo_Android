package com.api.glovo.service.valoracion;

import com.api.glovo.domain.Valoracion;
import com.api.glovo.repository.ValoracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValoracionServiceImp implements ValoracionService {

    @Autowired
    private ValoracionRepository valoracionRepository;

    @Override
    public List<Valoracion> getMediaValoraciones() {
        List<Valoracion> listadoMediaValoraciones = valoracionRepository. getMediaValoraciones();
        return listadoMediaValoraciones;
    }


}
