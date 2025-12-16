package academy.devdojo.maratona.javacore.ZZGconcurrent.service;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService executor = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName){
        System.out.printf("getting prices sync for store %s%n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPricesAsyncFuture(String storeName){
        System.out.printf("Setting prices sync for store %s%n", storeName);
        return executor.submit(this::priceGenerator);
    }

    public CompletableFuture<Double> getPricesAsyncCompetableFuture(String storeName){
        System.out.printf("Setting prices sync for store %s%n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    public static void shutdown(){
        executor.shutdown();
    }

    private double priceGenerator(){
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
