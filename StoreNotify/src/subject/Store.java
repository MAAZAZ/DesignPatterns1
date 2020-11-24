package subject;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Store implements Subject {
    private List<Observer> customers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer customer) {
        customers.add(customer);
    }
    @Override
    public void removeSubscriber(Observer customer) {
        customers.remove(customer);
    }
    @Override
    public void notifySubscribers() {
        System.out.println("Un nouvel article est en vente! Agissez vite avant qu'il ne se vende.");
        for(Observer customer: customers) {
            customer.update("Vente!");
        }
    }
}

