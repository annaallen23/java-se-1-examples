package code.examples.pickers;

import code.examples.apples.Apple;
import code.examples.apples.BadApple;
import code.examples.apples.MetricApple;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RipeApplePickerTest {


    private Apple redApple = new MetricApple("Pippin", "red", 100);
    private Apple greenApple = new MetricApple("Pippin", "green", 250);



    private Apple apple = new BadApple("Pippin", "green", 250);

    private RipeApplePicker applePicker = new RipeApplePicker();

    @Test
    public void whenPickingApplesRedApplesShouldBePicked() {
        double result = applePicker.pick(redApple);
        assertThat(result).isEqualTo(redApple.getWeight());
    }

    @Test
    public void whenPickingApplesGreenApplesShouldNotBePicked() {
        double result = applePicker.pick(greenApple);
        assertThat(result).isEqualTo(0);
    }

}
