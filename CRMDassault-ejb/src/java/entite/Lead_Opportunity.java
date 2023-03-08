/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author thoma
 */
@Entity
public class Lead_Opportunity implements Serializable {

    @OneToMany(mappedBy = "leLead")
    private List<Offre> offres;

    @OneToMany(mappedBy = "leLead")
    private Collection<Vendeur_Lead> lesVendeur_Leads;

    @OneToMany(mappedBy = "leLead")
    private Collection<Marketer_Lead> lesMarketer_Leads;

    @OneToMany(mappedBy = "leLead_Opportunity")
    private Collection<Enregistrement> lesEnregistrements;



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
        if (!(object instanceof Lead_Opportunity)) {
            return false;
        }
        Lead_Opportunity other = (Lead_Opportunity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Lead_Opportunity[ id=" + id + " ]";
    }
    
    @Temporal(javax.persistence.TemporalType.DATE)
        private Date date_creation;
    
    @Temporal(javax.persistence.TemporalType.DATE)
        private Date date_modification;
    
    @Temporal(javax.persistence.TemporalType.DATE)
        private Date date_fin;
    
    

    /**
     * Get the value of date_fin
     *
     * @return the value of date_fin
     */
    public Date getDate_fin() {
        return date_fin;
    }

    /**
     * Set the value of date_fin
     *
     * @param date_fin new value of date_fin
     */
    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }


    /**
     * Get the value of date_modification
     *
     * @return the value of date_modification
     */
    public Date getDate_modification() {
        return date_modification;
    }

    /**
     * Set the value of date_modification
     *
     * @param date_modification new value of date_modification
     */
    public void setDate_modification(Date date_modification) {
        this.date_modification = date_modification;
    }


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
    
      public enum Interet {
        Faible, Moyen, Elevé
    }
      
          private Interet niveau_interet;

    /**
     * Get the value of niveau_interet
     *
     * @return the value of niveau_interet
     */
    public Interet getNiveau_interet() {
        return niveau_interet;
    }

    /**
     * Set the value of niveau_interet
     *
     * @param niveau_interet new value of niveau_interet
     */
    public void setNiveau_interet(Interet niveau_interet) {
        this.niveau_interet = niveau_interet;
    }

        private double probabilite_gain;

    /**
     * Get the value of probabilite_gain
     *
     * @return the value of probabilite_gain
     */
    public double getProbabilite_gain() {
        return probabilite_gain;
    }

    /**
     * Set the value of probabilite_gain
     *
     * @param probabilite_gain new value of probabilite_gain
     */
    public void setProbabilite_gain(double probabilite_gain) {
        this.probabilite_gain = probabilite_gain;
    }
    
        private Interet niveau_risque;

    /**
     * Get the value of niveau_risque
     *
     * @return the value of niveau_risque
     */
    public Interet getNiveau_risque() {
        return niveau_risque;
    }

    /**
     * Set the value of niveau_risque
     *
     * @param niveau_risque new value of niveau_risque
     */
    public void setNiveau_risque(Interet niveau_risque) {
        this.niveau_risque = niveau_risque;
    }

        private double budget_estimatif;

    /**
     * Get the value of budget_estimatif
     *
     * @return the value of budget_estimatif
     */
    public double getBudget_estimatif() {
        return budget_estimatif;
    }

    /**
     * Set the value of budget_estimatif
     *
     * @param budget_estimatif new value of budget_estimatif
     */
    public void setBudget_estimatif(double budget_estimatif) {
        this.budget_estimatif = budget_estimatif;
    }

        private String statut;

    /**
     * Get the value of statut
     *
     * @return the value of statut
     */
    public String getStatut() {
        return statut;
    }

    /**
     * Set the value of statut
     *
     * @param statut new value of statut
     */
    public void setStatut(String statut) {
        this.statut = statut;
    }

        private String etat;

    /**
     * Get the value of etat
     *
     * @return the value of etat
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Set the value of etat
     *
     * @param etat new value of etat
     */
    public void setEtat(String etat) {
        this.etat = etat;
    }
    
        public Collection<Enregistrement> getLesEnregistrements() {
        return lesEnregistrements;
    }

    public void setLesEnregistrements(Collection<Enregistrement> lesEnregistrements) {
        this.lesEnregistrements = lesEnregistrements;
    }

    public Collection<Vendeur_Lead> getLesVendeur_Leads() {
        return lesVendeur_Leads;
    }

    public void setLesVendeur_Leads(Collection<Vendeur_Lead> lesVendeur_Leads) {
        this.lesVendeur_Leads = lesVendeur_Leads;
    }

    public Collection<Marketer_Lead> getLesMarketer_Leads() {
        return lesMarketer_Leads;
    }

    public void setLesMarketer_Leads(Collection<Marketer_Lead> lesMarketer_Leads) {
        this.lesMarketer_Leads = lesMarketer_Leads;
    }
    
    @OneToOne
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


    


    
}
    