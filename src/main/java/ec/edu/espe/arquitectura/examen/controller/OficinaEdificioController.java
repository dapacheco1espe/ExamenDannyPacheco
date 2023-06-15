package ec.edu.espe.arquitectura.examen.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.examen.model.OficinaEdificio;
import ec.edu.espe.arquitectura.examen.model.OficinaSede;
import ec.edu.espe.arquitectura.examen.service.OficinaEdificioService;

@RestController
@RequestMapping("/api/v1/edificios")
public class OficinaEdificioController {

    private final OficinaEdificioService oficinaEdificioService;

    public OficinaEdificioController(OficinaEdificioService oficinaEdificioService) {
        this.oficinaEdificioService = oficinaEdificioService;
    }

    @PutMapping
    public ResponseEntity<OficinaEdificio> update(@RequestBody String newName, @RequestBody String codEdificio) {
        try {
            OficinaEdificio clienteRS = this.oficinaEdificioService.modifyEdificioByNombre(newName, codEdificio);
            return ResponseEntity.ok(clienteRS);
        } catch (RuntimeException rte) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{code}/{superficie}")
    public ResponseEntity<List<OficinaEdificio>> obtainByCodeAndSuperficie(@PathVariable(name = "code") String code, @PathVariable(name = "superficie") BigDecimal superficie ) {
        List<OficinaEdificio> edificios = this.oficinaEdificioService.listAllEdificiosBySuperficie(code, superficie);
        if (edificios.size() > 0) {
            return ResponseEntity.ok(edificios);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
