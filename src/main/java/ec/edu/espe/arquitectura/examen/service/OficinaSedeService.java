package ec.edu.espe.arquitectura.examen.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examen.model.OficinaSede;
import ec.edu.espe.arquitectura.examen.repository.OficinaSedeRepository;

@Service
public class OficinaSedeService {
    private final OficinaSedeRepository oficinaSedeRepository;

    public OficinaSedeService(OficinaSedeRepository oficinaSedeRepository){
        this.oficinaSedeRepository = oficinaSedeRepository;
    }

    public OficinaSede createNewSede(OficinaSede sede){
        OficinaSede sedeTmp = this.oficinaSedeRepository.findByCodigoInstitucionAndEsPrincipal(sede.getCodigoInstitucion(),sede.getEsPrincipal());
        if (sedeTmp == null) {
            return this.oficinaSedeRepository.save(sede);
        } else {
            throw new RuntimeException("La sede que va a generar ya existe o es principal");
        }
    }

    public List<OficinaSede> getSedesListByCodigo(Integer codigoInstitucion){
        List<OficinaSede> oficinasList = this.oficinaSedeRepository.listByCodigoInstitucion(codigoInstitucion);
        if(oficinasList.size()>0){
            return oficinasList;
        }else{
            throw new RuntimeException("No existen sedes con el código institucional proporcionado: "+codigoInstitucion);
        }
    }
}
