package code.examples.apples;

public class MetricApple implements Apple {

    final int weight;
    private final String variety;
    private final String colour;

    public MetricApple(String variety, String colour, int weight) {
        this.variety = variety;
        this.colour = colour;
        this.weight = weight;
    }

    public String getVariety() {
        return variety;
    }

    public String getColour() {
        return colour;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "MetricApple{" +
                "variety='" + getVariety() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", weight=" + getWeight() +
                '}';
    }
}
