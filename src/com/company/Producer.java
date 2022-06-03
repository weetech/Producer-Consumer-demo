package com.company;

public class Producer {
    private final Collection<Image> collection;

    public Producer(Collection<Image> collection) {
        this.collection = collection;
    }

    public void produce() throws InterruptedException {
        int count = 1;
        while (true) {
            synchronized (collection) {
                while (this.collection.getSize() == this.collection.getCapacity()) {
                    collection.wait();
                }
                Image img = new Image("img" + count + ".jpg");
                System.out.println("Producer produced image: " + img.getName());
                this.collection.add(img);
                collection.notify();
                Thread.sleep(1000);
                count++;
            }
        }
    }
}
