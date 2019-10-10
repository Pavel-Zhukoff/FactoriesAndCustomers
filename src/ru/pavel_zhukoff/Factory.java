package ru.pavel_zhukoff;

public class Factory implements Runnable {

    private Store store;
    public Factory(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 0; i < 6; i++) {
            store.addProduct();
        }
    }
}
