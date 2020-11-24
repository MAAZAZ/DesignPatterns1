package Interface;

public class Client implements IUtilisateur{
    private String nom;

    public Client(String nom) {
        this.nom = nom;
    }

    @Override
    public void AfficherUtilisateur() {
        System.out.println("- Client : "+ this.nom);
    }
}
