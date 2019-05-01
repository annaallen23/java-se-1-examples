package code.examples.apples;

public class BigApple implements Apple {

    private final int weight;
    private final String variety;
    private final String colour;
    private final String producer;


    public BigApple(String variety, String colour, int weight, String growerName) {
        this.variety = variety;
        this.colour = colour;
        this.weight = weight;
        this.producer = growerName;
    }


    @Override
    public String getVariety() {
        return null;
    }

    @Override
    public String getColour() {
        return null;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    public String getGrowerName() {
        return producer;
    }
}
