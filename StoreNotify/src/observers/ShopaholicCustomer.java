package observers;

public class ShopaholicCustomer implements Observer {
    @Override
    public void update(String message) {
        processMessage(message);
    }
    private void processMessage(String message) {
        System.out.println("Le client Shopaholic est intéressé par l'achat du produit en solde!");
    }
}


