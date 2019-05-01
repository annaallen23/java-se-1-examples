package code.examples.predicate;


import java.util.function.Predicate;

public class FlexApplePicker {


    public int pick(Predicate<Apple> predicate, Apple apple){
        if (predicate.test(apple)) {
            return apple.getWeight();
        }
        return 0;
    }
}
