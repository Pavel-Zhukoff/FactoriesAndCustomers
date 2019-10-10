package ru.pavel_zhukoff;

public class Store {
    private int products;

    public Store () {
        products = 0;
    }

    public synchronized void addProduct() {
        while (products >= 3) {
            try  {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        products++;
        System.out.printf("Производитель %s добавил на склад 1 товар!", Thread.currentThread().getName());
        System.out.printf("Теперь на складе %d товаров!", products);
        notify();
    }

    public synchronized void getProduct() {
        while (products < 1) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        products--;
        System.out.printf("Покупатель %s купил товар!", Thread.currentThread().getName());
        System.out.printf("Теперь на складе %d товаров!", products);
        notify();
    }
}
