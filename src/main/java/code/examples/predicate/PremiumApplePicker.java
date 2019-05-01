package code.examples.predicate;



public class PremiumApplePicker {

    public int pick(Apple apple) {
        if(apple.getColour().equals("red") && apple.getWeight() > 199) {
            return apple.getWeight();
        }
        return 0;
    }

}
