package ru.pavel_zhukoff;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Client client = new Client(store);
        Factory factory = new Factory(store);

        new Thread(client, "Client").start();
        new Thread(factory, "Factory").start();
    }
}
