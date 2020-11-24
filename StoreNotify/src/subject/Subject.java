package subject;

import observers.Observer;

public interface Subject {
     void addSubscriber(Observer observer);
     void removeSubscriber(Observer observer);
     void notifySubscribers();
}

