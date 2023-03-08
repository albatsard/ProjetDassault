/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author thoma
 */
@Entity
public class Vendeur_Lead implements Serializable {

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
        if (!(object instanceof Vendeur_Lead)) {
            return false;
        }
        Vendeur_Lead other = (Vendeur_Lead) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Vendeur_Lead[ id=" + id + " ]";
    }
    
    @ManyToOne
        private Utilisateur leVendeur;

    /**
     * Get the value of leVendeur
     *
     * @return the value of leVendeur
     */
    public Utilisateur getLeVendeur() {
        return leVendeur;
    }

    /**
     * Set the value of leVendeur
     *
     * @param leVendeur new value of leVendeur
     */
    public void setLeVendeur(Utilisateur leVendeur) {
        this.leVendeur = leVendeur;
    }

    @ManyToOne
        private Lead_Opportunity leLead;

    /**
     * Get the value of leLead
     *
     * @return the value of leLead
     */
    public Lead_Opportunity getLeLead() {
        return leLead;
    }

    /**
     * Set the value of leLead
     *
     * @param leLead new value of leLead
     */
    public void setLeLead(Lead_Opportunity leLead) {
        this.leLead = leLead;
    }

    
}
