package ec.edu.espe.arquitectura.examen.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examen.model.OficinaEdificio;
import ec.edu.espe.arquitectura.examen.repository.OficinaEdificioRepository;

@Service
public class OficinaEdificioService {
    private final OficinaEdificioRepository oficinaEdificioRepository;

    public OficinaEdificioService(OficinaEdificioRepository oficinaEdificioRepository) {
        this.oficinaEdificioRepository = oficinaEdificioRepository;
    }

    public OficinaEdificio modifyEdificioByNombre(String newNombre, String codigoEdificio) {
        OficinaEdificio oficinaTmp = this.oficinaEdificioRepository.findByCodigoEdificio(codigoEdificio);
        if (oficinaTmp != null) {
            oficinaTmp.setNombre(newNombre);
            this.oficinaEdificioRepository.save(oficinaTmp);
            return oficinaTmp;
        } else {
            throw new RuntimeException("El edificio con el código proprocionado no existe y no se puede actualizar");
        }
    }

    public List<OficinaEdificio> listAllEdificiosBySuperficie(String codigoSede, BigDecimal superficie){
         List<OficinaEdificio> oficinasList = this.oficinaEdificioRepository.findByCodigoSedeOrderBySuperficieDesc(codigoSede, superficie);
        if(oficinasList.size()>0){
            return oficinasList;
        }else{
            throw new RuntimeException("No existen edificios con el código de sede y superficie proporcionados: "+codigoSede+" "+superficie);
        }
    }
}
