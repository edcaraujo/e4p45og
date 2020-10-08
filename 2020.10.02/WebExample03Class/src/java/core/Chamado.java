/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author edcar
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Chamado.findAll", query = "SELECT c FROM Chamado c")})
public class Chamado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String userMatricula;
    
    @Column
    private String userTelefone;
    
    @Column
    private String equipEtiqueta;
    
    @Column
    private String categoria;
    
    @Column 
    private String descricao;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserMatricula() {
        return userMatricula;
    }

    public void setUserMatricula(String userMatricula) {
        this.userMatricula = userMatricula;
    }

    public String getUserTelefone() {
        return userTelefone;
    }

    public void setUserTelefone(String userTelefone) {
        this.userTelefone = userTelefone;
    }

    public String getEquipEtiqueta() {
        return equipEtiqueta;
    }

    public void setEquipEtiqueta(String equipEtiqueta) {
        this.equipEtiqueta = equipEtiqueta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chamado)) {
            return false;
        }
        Chamado other = (Chamado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "core.Chamado[ id=" + id + " ]";
    }
    
}
