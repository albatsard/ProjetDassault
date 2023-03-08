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
public class Produit_Offre implements Serializable {

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
        if (!(object instanceof Produit_Offre)) {
            return false;
        }
        Produit_Offre other = (Produit_Offre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Produit_Offre[ id=" + id + " ]";
    }
    
        private int quantite;

    /**
     * Get the value of quantite
     *
     * @return the value of quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * Set the value of quantite
     *
     * @param quantite new value of quantite
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @ManyToOne
        private Offre leOffre;

    /**
     * Get the value of leOffre
     *
     * @return the value of leOffre
     */
    public Offre getLeOffre() {
        return leOffre;
    }

    /**
     * Set the value of leOffre
     *
     * @param leOffre new value of leOffre
     */
    public void setLeOffre(Offre leOffre) {
        this.leOffre = leOffre;
    }

    @ManyToOne
        private entite.Produit leProduit;

    /**
     * Get the value of leProduit
     *
     * @return the value of leProduit
     */
    public entite.Produit getLeProduit() {
        return leProduit;
    }

    /**
     * Set the value of leProduit
     *
     * @param leProduit new value of leProduit
     */
    public void setLeProduit(entite.Produit leProduit) {
        this.leProduit = leProduit;
    }

    
}
