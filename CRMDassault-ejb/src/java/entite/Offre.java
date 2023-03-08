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

/**
 *
 * @author thoma
 */
@Entity
public class Offre implements Serializable {

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
        if (!(object instanceof Offre)) {
            return false;
        }
        Offre other = (Offre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Offre[ id=" + id + " ]";
    }
    
        private double remise;

    /**
     * Get the value of remise
     *
     * @return the value of remise
     */
    public double getRemise() {
        return remise;
    }

    /**
     * Set the value of remise
     *
     * @param remise new value of remise
     */
    public void setRemise(double remise) {
        this.remise = remise;
    }

        private double prix_detaille;

    /**
     * Get the value of prix_detaille
     *
     * @return the value of prix_detaille
     */
    public double getPrix_detaille() {
        return prix_detaille;
    }

    /**
     * Set the value of prix_detaille
     *
     * @param prix_detaille new value of prix_detaille
     */
    public void setPrix_detaille(double prix_detaille) {
        this.prix_detaille = prix_detaille;
    }

        private double prix_total;

    /**
     * Get the value of prix_total
     *
     * @return the value of prix_total
     */
    public double getPrix_total() {
        return prix_total;
    }

    /**
     * Set the value of prix_total
     *
     * @param prix_total new value of prix_total
     */
    public void setPrix_total(double prix_total) {
        this.prix_total = prix_total;
    }

        private String conditions;

    /**
     * Get the value of conditions
     *
     * @return the value of conditions
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * Set the value of conditions
     *
     * @param conditions new value of conditions
     */
    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
    
   

    

    
}
