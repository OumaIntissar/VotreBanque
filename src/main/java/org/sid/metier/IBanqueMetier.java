package org.sid.metier;

import org.sid.entities.Compte;
import org.sid.entities.Operation;
import org.springframework.data.domain.Page;

public interface IBanqueMetier {
    public Compte consulterCompte(String codeCpte);
    public void verser(String codeCpte,double montant);
    public void retirer(String codeCpte,double monatnt);
    public void virement(String codeCpt1,String codeCpt2,double montant);
    public Page<Operation> listOperation(String codeCpte,int page,int size);

}
