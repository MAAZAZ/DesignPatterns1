import Adapter.Employe;
import Adapter.EmployeAdapter;
import Interface.Client;
import Interface.IUtilisateur;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(new Client("AB distributeur"));
        Employe employe = new Employe("Mohammed stif", "Vendeur de fromage");
        list.add(new EmployeAdapter(employe));
        AfficherUtilisateurs(list);
    }

    static void AfficherUtilisateurs(List list)
    {
        for(Object utilisateur : list)
        {
            ((IUtilisateur)utilisateur).AfficherUtilisateur();
        }
    }
}
