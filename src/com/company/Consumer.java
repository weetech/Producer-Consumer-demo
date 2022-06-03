package com.company;

public class Consumer {
    private final Collection<Image> collection;

    public Consumer(Collection<Image> collection) {
        this.collection = collection;
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (collection) {
                while (this.collection.getSize() == 0) {
                    collection.wait();
                }
                Image img = this.collection.popFirstImage();
                System.out.println("Consumer consumed image:" + img.getName());
                collection.notify();
                Thread.sleep(1000);
            }
        }
    }
}
