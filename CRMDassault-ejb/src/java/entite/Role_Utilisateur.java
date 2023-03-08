/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author thoma
 */
@Entity
public class Role_Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Role_Utilisateur)) {
            return false;
        }
        Role_Utilisateur other = (Role_Utilisateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Role_Utilisateur[ id=" + id + " ]";
    }
    
    @ManyToOne
        private Utilisateur leUtilisateur;

    /**
     * Get the value of leUtilisateur
     *
     * @return the value of leUtilisateur
     */
    public Utilisateur getLeUtilisateur() {
        return leUtilisateur;
    }

    /**
     * Set the value of leUtilisateur
     *
     * @param leUtilisateur new value of leUtilisateur
     */
    public void setLeUtilisateur(Utilisateur leUtilisateur) {
        this.leUtilisateur = leUtilisateur;
    }
    
    @ManyToOne
        private Roles leRole;

    /**
     * Get the value of leRole
     *
     * @return the value of leRole
     */
    public Roles getLeRole() {
        return leRole;
    }

    /**
     * Set the value of leRole
     *
     * @param leRole new value of leRole
     */
    public void setLeRole(Roles leRole) {
        this.leRole = leRole;
    }
    
    @Temporal(javax.persistence.TemporalType.DATE)
        private Date date_creation;

    /**
     * Get the value of date_creation
     *
     * @return the value of date_creation
     */
    public Date getDate_creation() {
        return date_creation;
    }

    /**
     * Set the value of date_creation
     *
     * @param date_creation new value of date_creation
     */
    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }


    
    

    
}
