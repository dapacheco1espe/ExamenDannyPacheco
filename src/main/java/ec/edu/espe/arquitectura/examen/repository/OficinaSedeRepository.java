package ec.edu.espe.arquitectura.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examen.model.OficinaSede;

public interface OficinaSedeRepository extends JpaRepository<OficinaSede,String>{
    OficinaSede findByCodigoInstitucionAndEsPrincipal(Integer codigoInstitucion, Boolean esPrincipal);
    List<OficinaSede> listByCodigoInstitucion(Integer codigoInstitucion);
}
