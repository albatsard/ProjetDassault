/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

import java.io.Serializable;
import java.sql.Timestamp;
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
public class Action implements Serializable {

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
        if (!(object instanceof Action)) {
            return false;
        }
        Action other = (Action) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Journal_Action[ id=" + id + " ]";
    }
    
    @Temporal(javax.persistence.TemporalType.DATE)
        private Date date;

    /**
     * Get the value of date
     *
     * @return the value of date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the value of date
     *
     * @param date new value of date
     */
    public void setDate(Date date) {
        this.date = date;
    }

        private Timestamp heure;

    /**
     * Get the value of heure
     *
     * @return the value of heure
     */
    public Timestamp getHeure() {
        return heure;
    }

    /**
     * Set the value of heure
     *
     * @param heure new value of heure
     */
    public void setHeure(Timestamp heure) {
        this.heure = heure;
    }

        private String libelle;

    /**
     * Get the value of libelle
     *
     * @return the value of libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Set the value of libelle
     *
     * @param libelle new value of libelle
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
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

}
