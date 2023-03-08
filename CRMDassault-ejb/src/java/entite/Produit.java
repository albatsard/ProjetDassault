/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author thoma
 */
@Entity
public class Produit implements Serializable {

    @OneToMany(mappedBy = "leProduit")
    private List<Produit_Offre> lesProduit_Offres;

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
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Produit[ id=" + id + " ]";
    }
    
        private String denomination;

    /**
     * Get the value of denomination
     *
     * @return the value of denomination
     */
    public String getDenomination() {
        return denomination;
    }

    /**
     * Set the value of denomination
     *
     * @param denomination new value of denomination
     */
    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

        private String description;

    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
        private double prix_unitaire;

    /**
     * Get the value of prix_unitaire
     *
     * @return the value of prix_unitaire
     */
    public double getPrix_unitaire() {
        return prix_unitaire;
    }

    /**
     * Set the value of prix_unitaire
     *
     * @param prix_unitaire new value of prix_unitaire
     */
    public void setPrix_unitaire(double prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    public List<Produit_Offre> getLesProduit_Offres() {
        return lesProduit_Offres;
    }

    public void setLesProduit_Offres(List<Produit_Offre> lesProduit_Offres) {
        this.lesProduit_Offres = lesProduit_Offres;
    }
    
    

    
}
