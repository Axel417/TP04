/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompteBancaire.gestionnaire;

import CompteBancaire.modeles.CompteBancaire;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Axel Koffi
 */
@Stateless
public class GestionnaireCompteBancaire {

    @PersistenceContext
    private EntityManager em;

    public void creerCompteUtilisateursDeTest() {
        creeCompte("Koffi", "Axel", "12112", 5000);
        
    }

    public CompteBancaire creeCompte(String nom, String prenom, String numero,double balance) {
        CompteBancaire u = new CompteBancaire(nom, prenom, numero, balance);
        em.persist(u);
        return u;
    }

    public Collection<CompteBancaire> getAllCompte() {
        // Exécution d'une requête équivalente à un select *
        Query q = em.createQuery("select u from CompteBancaire u");
        return q.getResultList();
    }
}
