package ec.edu.espe.arquitectura.examen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OFI_INSTITUCION")
public class OficinaInstitucion {
    @Id
    @Column(name = "COD_INSTITUCION", nullable = false)
    private Integer codigo;
    @Column(name = "RUC", length = 13, nullable = false)
    private String ruc;
    @Column(name = "RAZON_SOCIAL", length = 250, nullable = false)
    private String razonSocial;
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    public OficinaInstitucion(){}
    public OficinaInstitucion(Integer codigo){
        this.codigo = codigo;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getRuc() {
        return ruc;
    }
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public Integer getVersion() {
        return version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }
    
    @Override
    public String toString() {
        return "OficinaInstitucion [codigo=" + codigo + ", ruc=" + ruc + ", razonSocial=" + razonSocial + ", version="
                + version + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
        OficinaInstitucion other = (OficinaInstitucion) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    
}
