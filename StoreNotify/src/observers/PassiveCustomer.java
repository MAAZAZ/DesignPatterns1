package observers;

public class PassiveCustomer implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Le client passif a pris note de la vente.");
    }
}

