/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompteBancaire.modeles;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Axel Koffi
 */
@Entity
public class CompteBancaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstname;
    private String lastname;
    private String accountNumber;
    private double balance;

    public CompteBancaire() {
    }

    public CompteBancaire(final String firstname, final String lastname, final String accountNumber, final double balance) {

        this.lastname = lastname;
        this.firstname = firstname;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public CompteBancaire(String nom, String prenom, String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // getter setter id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // getter setter firstname
    public String getFirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    // getter setter lastname
    public String getlastname() {
        return firstname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    // getter setter accountNumber
    public String getaccountNumber() {
        return accountNumber;
    }

    public void setaccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // getter setter accountNumber
    public double getbalance() {
        return balance;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompteBancaire)) {
            return false;
        }
        CompteBancaire other = (CompteBancaire) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CompteBancaire.modeles.CompteBancaire[ id=" + id + " ]";
    }

}
