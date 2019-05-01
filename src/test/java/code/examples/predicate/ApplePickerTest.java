package code.examples.predicate;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplePickerTest {


    private Apple redApple = new Apple("Pippin", "red", 100);
    private Apple greenApple = new Apple("Pippin", "green", 250);

    private RipeApplePicker applePicker = new RipeApplePicker();

    @Test
    public void whenPickingApplesRedApplesShouldBePicked() {
        int result = applePicker.pick(redApple);
        assertThat(result).isEqualTo(redApple.getWeight());
    }

    @Test
    public void whenPickingApplesGreenApplesShouldNotBePicked() {
        int result = applePicker.pick(greenApple);
        assertThat(result).isEqualTo(0);
    }

}
