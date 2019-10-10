package ru.pavel_zhukoff;

public class Client implements Runnable {

    private Store store;

    public Client(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 0; i < 6; i++) {
            store.getProduct();
        }
    }
}
