package Adapter;

import Interface.IUtilisateur;

public class EmployeAdapter implements IUtilisateur {

    private Employe employe;

    public EmployeAdapter(Employe employe) {
        this.employe = employe;
    }

    @Override
    public void AfficherUtilisateur() {
        System.out.println("- Employé : "+employe.getNom()+" ("+employe.getPoste()+")");
    }
}

