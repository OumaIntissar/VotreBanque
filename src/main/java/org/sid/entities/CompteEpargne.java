package org.sid.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {
    private double taux;

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public CompteEpargne(String codeCompte, Date dateCreation, Double solde, Client client, double taux) {

        super(codeCompte, dateCreation, solde, client);
        this.taux = taux;
    }

    public CompteEpargne() {
    	super();

    }
}
