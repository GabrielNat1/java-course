package academy.devdojo.maratona.javacore.ZZGconcurrent.test;

import academy.devdojo.maratona.javacore.ZZGconcurrent.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
//        searchPricesSync(storeService);
//        searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompetableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("store 1"));
        System.out.println(storeService.getPriceSync("store 2"));
        System.out.println(storeService.getPriceSync("store 3"));
        System.out.println(storeService.getPriceSync("store 4"));
        System.out.println(storeService.getPriceSync("store 5"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync, %dms%n", (end-start));
        StoreService.shutdown();
    }

    private static void searchPricesAsyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture1 = storeService.getPricesAsyncFuture("store 1");
        Future<Double> pricesAsyncFuture2 = storeService.getPricesAsyncFuture("store 1");
        Future<Double> pricesAsyncFuture3 = storeService.getPricesAsyncFuture("store 1");
        Future<Double> pricesAsyncFuture4 = storeService.getPricesAsyncFuture("store 1");
        Future<Double> pricesAsyncFuture5 = storeService.getPricesAsyncFuture("store 1");
        try {
            System.out.println(pricesAsyncFuture1.get());
            System.out.println(pricesAsyncFuture2.get());
            System.out.println(pricesAsyncFuture3.get());
            System.out.println(pricesAsyncFuture4.get());
            System.out.println(pricesAsyncFuture5.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync, %dms%n", (end-start));
        StoreService.shutdown();
    }

    private static void searchPricesAsyncCompetableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsyncFuture1 = storeService.getPricesAsyncCompetableFuture("store 1");
        CompletableFuture<Double> pricesAsyncFuture2 = storeService.getPricesAsyncCompetableFuture("store 1");
        CompletableFuture<Double> pricesAsyncFuture3 = storeService.getPricesAsyncCompetableFuture("store 1");
        CompletableFuture<Double> pricesAsyncFuture4 = storeService.getPricesAsyncCompetableFuture("store 1");
        CompletableFuture<Double> pricesAsyncFuture5 = storeService.getPricesAsyncCompetableFuture("store 1");

        System.out.println(pricesAsyncFuture1.join());
        System.out.println(pricesAsyncFuture2.join());
        System.out.println(pricesAsyncFuture3.join());
        System.out.println(pricesAsyncFuture4.join());
        System.out.println(pricesAsyncFuture5.join());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync, %dms%n", (end-start));
//        StoreService.shutdown();
    }
}
