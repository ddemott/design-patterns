package com.demott.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Subject
interface NewsAgency {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String news);
}

// Concrete Subject
class SimpleNewsAgency implements NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news) {
        for (Subscriber s : subscribers) {
            s.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println("Agency publishes: " + news);
        notifySubscribers(news);
    }
}

// Observer
interface Subscriber {
    void update(String news);
}

// Concrete Observer
class EmailSubscriber implements Subscriber {
    private String email;
    public EmailSubscriber(String email) { this.email = email; }
    @Override
    public void update(String news) {
        System.out.println("Email to " + email + ": " + news);
    }
}

class SmsSubscriber implements Subscriber {
    private String phone;
    public SmsSubscriber(String phone) { this.phone = phone; }
    @Override
    public void update(String news) {
        System.out.println("SMS to " + phone + ": " + news);
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        SimpleNewsAgency agency = new SimpleNewsAgency();
        Subscriber alice = new EmailSubscriber("alice@example.com");
        Subscriber bob = new SmsSubscriber("555-1234");
        agency.addSubscriber(alice);
        agency.addSubscriber(bob);

        agency.publishNews("Breaking: Observer pattern in action!");
        agency.publishNews("Update: More news for subscribers.");
    }
}
