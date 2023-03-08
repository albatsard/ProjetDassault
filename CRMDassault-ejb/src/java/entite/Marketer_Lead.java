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
public class Marketer_Lead implements Serializable {

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
        if (!(object instanceof Marketer_Lead)) {
            return false;
        }
        Marketer_Lead other = (Marketer_Lead) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Marketer_Lead[ id=" + id + " ]";
    }
    
    @ManyToOne
        private Utilisateur leMarketeur;

    /**
     * Get the value of leMarketeur
     *
     * @return the value of leMarketeur
     */
    public Utilisateur getLeMarketeur() {
        return leMarketeur;
    }

    /**
     * Set the value of leMarketeur
     *
     * @param leMarketeur new value of leMarketeur
     */
    public void setLeMarketeur(Utilisateur leMarketeur) {
        this.leMarketeur = leMarketeur;
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
