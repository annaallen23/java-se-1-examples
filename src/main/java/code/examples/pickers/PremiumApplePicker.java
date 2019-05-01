package code.examples.pickers;


import code.examples.apples.Apple;

public class PremiumApplePicker implements BoilerPlateApplePicker {

    public double pick(Apple apple) {
        if(apple.getColour().equals("red") && apple.getWeight() > 199) {
            return apple.getWeight();
        }
        return 0;
    }

}
