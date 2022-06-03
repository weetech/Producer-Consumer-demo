package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final Collection<Image> collection = new Collection<Image>(2);
        final Producer producer = new Producer(collection);
        final Consumer consumer = new Consumer(collection);

        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producerThread.start();
        consumerThread.start();

//        producerThread.join();
//        consumerThread.join();
    }
}
