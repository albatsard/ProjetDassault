/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author thoma
 */
@Entity
public class Utilisateur implements Serializable {

    @OneToMany(mappedBy = "leVendeur")
    private List<Lead_Opportunity> les_Vendeur_lead_Opportunitys;

    @OneToMany(mappedBy = "leMarketeur")
    private List<Lead_Opportunity> les_Marketeur_lead_Opportunitys;


    @OneToMany(mappedBy = "leUtilisateur")
    private Collection<Action> lesActions;


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
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Utilisateur[ id=" + id + " ]";
    }
    
        private String nom;

    /**
     * Get the value of nom
     *
     * @return the value of nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the value of nom
     *
     * @param nom new value of nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

        private String prenom;

    /**
     * Get the value of prenom
     *
     * @return the value of prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Set the value of prenom
     *
     * @param prenom new value of prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Column(nullable = false, unique=true)
        private String login;

    /**
     * Get the value of login
     *
     * @return the value of login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Set the value of login
     *
     * @param login new value of login
     */
    public void setLogin(String login) {
        this.login = login;
    }

        private String motdepasse;

    /**
     * Get the value of motdepasse
     *
     * @return the value of motdepasse
     */
    public String getMotdepasse() {
        return motdepasse;
    }

    /**
     * Set the value of motdepasse
     *
     * @param motdepasse new value of motdepasse
     */
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }


    public Collection<Action> getLesActions() {
        return lesActions;
    }

    public void setLesActions(Collection<Action> lesActions) {
        this.lesActions = lesActions;
    }
    
    @ManyToMany
        private Collection<Roles> lesRoles;

    /**
     * Get the value of lesRoles
     *
     * @return the value of lesRoles
     */
    public Collection<Roles> getLesRoles() {
        return lesRoles;
    }

    /**
     * Set the value of lesRoles
     *
     * @param lesRoles new value of lesRoles
     */
    public void setLesRoles(Collection<Roles> lesRoles) {
        this.lesRoles = lesRoles;
    }

    public List<Lead_Opportunity> getLes_Marketeur_lead_Opportunitys() {
        return les_Marketeur_lead_Opportunitys;
    }

    public void setLes_Marketeur_lead_Opportunitys(List<Lead_Opportunity> les_Marketeur_lead_Opportunitys) {
        this.les_Marketeur_lead_Opportunitys = les_Marketeur_lead_Opportunitys;
    }

//ezfezgg
    
//test

    



    
    
    
    
    

    
    
    
    
}
