package code.examples.pickers;


import code.examples.apples.Apple;

public class RipeApplePicker implements BoilerPlateApplePicker {

    public double pick(Apple apple) {
        if (apple.getColour().equals("red")) {
            return apple.getWeight();
        }
        return 0;
    }

}
