package ec.edu.espe.arquitectura.examen.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "OFI_SEDE")
public class OficinaSede {
    @Id
    @Column(name = "COD_SEDE",length = 8, nullable = false)
    private String codigo;
    @Column(name = "COD_INSTITUCION", nullable = false)
    private Integer codigoInstitucion;
    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;
    @Column(name = "DIRECCION", length = 200, nullable = false)
    private String direccion;
    @Column(name = "ES_PRINCIPAL",nullable = false)
    private Boolean esPrincipal;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION",nullable = false)
    private Date fechaCreacion;
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    public OficinaSede(){}
    public OficinaSede(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Integer getCodigoInstitucion() {
        return codigoInstitucion;
    }
    public void setCodigoInstitucion(Integer codigoInstitucion) {
        this.codigoInstitucion = codigoInstitucion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Boolean getEsPrincipal() {
        return esPrincipal;
    }
    public void setEsPrincipal(Boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Integer getVersion() {
        return version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }
    @Override
    public String toString() {
        return "OficinaSede [codigo=" + codigo + ", codigoInstitucion=" + codigoInstitucion + ", nombre=" + nombre
                + ", direccion=" + direccion + ", esPrincipal=" + esPrincipal + ", fechaCreacion=" + fechaCreacion
                + ", version=" + version + "]";
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
        OficinaSede other = (OficinaSede) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    
}
