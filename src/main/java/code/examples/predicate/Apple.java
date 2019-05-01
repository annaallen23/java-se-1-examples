package code.examples.predicate;

public class Apple {


    private final String variety;
    private final String colour;
    private final int weight;

    public Apple(String variety, String colour, int weight) {
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
        return "Apple{" +
                "variety='" + variety + '\'' +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                '}';
    }
}
