package academy.devdojo.maratona.javacore.ZZBbehavior.interfaces;

import academy.devdojo.maratona.javacore.ZZBbehavior.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
