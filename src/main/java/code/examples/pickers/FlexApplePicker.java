package code.examples.pickers;


import code.examples.apples.Apple;

import java.util.function.Predicate;

public class FlexApplePicker  {

    public int pick(Predicate<Apple> predicate, Apple apple) {
        if (predicate.test(apple)) {
            return apple.getWeight();
        }
        return 0;
    }


}