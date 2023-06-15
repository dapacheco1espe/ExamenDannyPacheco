package ec.edu.espe.arquitectura.examen.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examen.model.OficinaEdificio;
import ec.edu.espe.arquitectura.examen.model.OficinaEdificioPK;

public interface OficinaEdificioRepository extends JpaRepository<OficinaEdificio,OficinaEdificioPK>{
    List<OficinaEdificio> findByCodigoSedeOrderBySuperficieDesc(String codigoSede, BigDecimal superficie);
    OficinaEdificio findByCodigoEdificio(String codigoEdificio);
}
