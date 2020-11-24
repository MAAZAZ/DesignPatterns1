import observers.Observer;
import observers.PassiveCustomer;
import observers.ShopaholicCustomer;
import subject.Store;
import subject.Subject;

public class Program {
    public static void main(String[] args) {
        Subject fashionChainStores = new Store();
        Observer customer1 = new PassiveCustomer();
        Observer customer2 = new ShopaholicCustomer();
        Observer customer3 = new ShopaholicCustomer();

        // ajouter les deux clients pour recevoir les newsletter
        fashionChainStores.addSubscriber(customer1);
        fashionChainStores.addSubscriber(customer2);

        // informer les clients (observers)
        fashionChainStores.notifySubscribers();

        // un client choisi de ne pas recevoir des newsletter
        fashionChainStores.removeSubscriber(customer1);

        // customer2 informe customer3 qu'une vente est en cours
        fashionChainStores.addSubscriber(customer3);

        // Notifier la liste mise à jour des clients
        fashionChainStores.notifySubscribers();
    }
}
