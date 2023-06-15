package ec.edu.espe.arquitectura.examen.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "OFI_EDIFICIO")
public class OficinaEdificio {
    @EmbeddedId
    private OficinaEdificioPK oficinaEdificio;
    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;
    @Column(name = "PISOS", precision = 2, scale = 0, nullable = false)
    private BigDecimal pisos;
    @Column(name = "SUPERFICIE", precision = 7, scale = 2, nullable = false)
    private BigDecimal superficie;
    @Column(name = "VERSION", nullable = false)
    private Integer version;
    
    public OficinaEdificio(){}
    public OficinaEdificio(OficinaEdificioPK oficinaEdificio){
        this.oficinaEdificio = oficinaEdificio;
    }
    public OficinaEdificioPK getOficinaEdificio() {
        return oficinaEdificio;
    }
    public void setOficinaEdificio(OficinaEdificioPK oficinaEdificio) {
        this.oficinaEdificio = oficinaEdificio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public BigDecimal getPisos() {
        return pisos;
    }
    public void setPisos(BigDecimal pisos) {
        this.pisos = pisos;
    }
    public BigDecimal getSuperficie() {
        return superficie;
    }
    public void setSuperficie(BigDecimal superficie) {
        this.superficie = superficie;
    }
    public Integer getVersion() {
        return version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }
    @Override
    public String toString() {
        return "OficinaEdificio [oficinaEdificio=" + oficinaEdificio + ", nombre=" + nombre + ", pisos=" + pisos
                + ", superficie=" + superficie + ", version=" + version + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((oficinaEdificio == null) ? 0 : oficinaEdificio.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OficinaEdificio other = (OficinaEdificio) obj;
        if (oficinaEdificio == null) {
            if (other.oficinaEdificio != null)
                return false;
        } else if (!oficinaEdificio.equals(other.oficinaEdificio))
            return false;
        return true;
    }

    
}
