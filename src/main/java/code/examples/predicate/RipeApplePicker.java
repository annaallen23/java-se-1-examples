package code.examples.predicate;


public class RipeApplePicker {

    public int pick(Apple apple) {
        if (apple.getColour().equals("red")) {
            return apple.getWeight();
        }
        return 0;
    }

}
