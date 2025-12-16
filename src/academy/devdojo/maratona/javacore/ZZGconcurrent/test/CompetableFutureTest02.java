package academy.devdojo.maratona.javacore.ZZGconcurrent.test;

import academy.devdojo.maratona.javacore.ZZGconcurrent.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompetableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesAsyncCompetableFuture(storeService);
    }

    private static void searchPricesAsyncCompetableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store1", "Store2", "Store3", "Store4");

        List<CompletableFuture<Double>> competableFutures = stores.stream()
                .map(storeService::getPricesAsyncCompetableFuture)
                .toList();
        List<Double> prices = competableFutures.stream().map(CompletableFuture::join).toList();

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync, %dms%n", (end-start));
//        StoreService.shutdown();
    }
}
