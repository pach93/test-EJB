/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Khol.Bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cheikh
 */
@Entity
@Table(name = "ordinateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordinateur.findAll", query = "SELECT o FROM Ordinateur o"),
    @NamedQuery(name = "Ordinateur.findById", query = "SELECT o FROM Ordinateur o WHERE o.id = :id"),
    @NamedQuery(name = "Ordinateur.findByReference", query = "SELECT o FROM Ordinateur o WHERE o.reference = :reference"),
    @NamedQuery(name = "Ordinateur.findByMarque", query = "SELECT o FROM Ordinateur o WHERE o.marque = :marque"),
    @NamedQuery(name = "Ordinateur.findByRam", query = "SELECT o FROM Ordinateur o WHERE o.ram = :ram"),
    @NamedQuery(name = "Ordinateur.findByDisque", query = "SELECT o FROM Ordinateur o WHERE o.disque = :disque")})
public class Ordinateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "reference")
    private String reference;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "marque")
    private String marque;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "ram")
    private String ram;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "disque")
    private String disque;
    @JoinColumn(name = "idOs", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Os idOs;
    @JoinColumn(name = "idUser", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Utilisateur idUser;

    public Ordinateur() {
    }

    public Ordinateur(Integer id) {
        this.id = id;
    }

    public Ordinateur(Integer id, String reference, String marque, String ram, String disque) {
        this.id = id;
        this.reference = reference;
        this.marque = marque;
        this.ram = ram;
        this.disque = disque;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisque() {
        return disque;
    }

    public void setDisque(String disque) {
        this.disque = disque;
    }

    public Os getIdOs() {
        return idOs;
    }

    public void setIdOs(Os idOs) {
        this.idOs = idOs;
    }

    public Utilisateur getIdUser() {
        return idUser;
    }

    public void setIdUser(Utilisateur idUser) {
        this.idUser = idUser;
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
        if (!(object instanceof Ordinateur)) {
            return false;
        }
        Ordinateur other = (Ordinateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Khol.Bean.Ordinateur[ id=" + id + " ]";
    }
    
}
