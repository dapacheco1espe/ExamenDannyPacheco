package ec.edu.espe.arquitectura.examen.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.examen.model.OficinaSede;
import ec.edu.espe.arquitectura.examen.service.OficinaSedeService;

@RestController
@RequestMapping("/api/v1/sedes")
public class OficinaSedeController {
    private final OficinaSedeService oficinaSedeService;
    public OficinaSedeController(OficinaSedeService oficinaSedeService){
        this.oficinaSedeService = oficinaSedeService;
    }

     @GetMapping("/{code}")
    public ResponseEntity<List<OficinaSede>> obtainByCode(@PathVariable(name = "code") Integer code) {
        List<OficinaSede> sedes = this.oficinaSedeService.getSedesListByCodigo(code);
        if (sedes.size()>0) {
            return ResponseEntity.ok(sedes);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<OficinaSede> create(@RequestBody OficinaSede sede) {
        try {
            OficinaSede sedeRS = this.oficinaSedeService.createNewSede(sede);
            return ResponseEntity.ok(sedeRS);
        } catch (RuntimeException rte) {
            return ResponseEntity.badRequest().build();
        }
    }
}
