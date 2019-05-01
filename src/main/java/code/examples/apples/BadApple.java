package code.examples.apples;

public class BadApple extends MetricApple {

    public BadApple(String variety, String colour, int weight) {
        super(variety, colour, weight);
    }

    @Override
    public int getWeight() {
        return  weight * 10;
    }

    @Override
    public String toString() {
        return "BadApple{" +
                "} " + super.toString();
    }
}
