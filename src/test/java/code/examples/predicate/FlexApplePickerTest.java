package code.examples.predicate;

import org.junit.Test;

import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

public class FlexApplePickerTest {

    private Apple premiumRedApple = new Apple("Pippin", "red", 250);
    private Apple redApple = new Apple("Pippin", "red", 100);
    private Apple greenApple = new Apple("Pippin", "green", 250);

    private FlexApplePicker applePicker = new FlexApplePicker();


    Predicate<Apple> redApplePredicate = (Apple apple) -> apple.getColour().equals("red");

    Predicate<Apple> redPremiumApplePredicate = apple -> {
        boolean result = false;
        if (apple.getColour().equals("red") && apple.getWeight() > 199) {
            result = true;
        }
        return result;

    };


    @Test
    public void flexApplePickerShouldPickRedApples() {
        int result = applePicker.pick(redApplePredicate, premiumRedApple);
        assertThat(result).isEqualTo(premiumRedApple.getWeight());
    }

    @Test
    public void flexApplePickerShouldNotPickGreenApples() {
        int result = applePicker.pick(redApplePredicate, greenApple);
        assertThat(result).isEqualTo(0);
    }



    @Test
    public void flexApplePickerShouldPickPremiumApples() {
        int result = applePicker.pick(redPremiumApplePredicate, premiumRedApple);
        assertThat(result).isEqualTo(premiumRedApple.getWeight());
    }

    @Test
    public void flexApplePickerShouldNotPickSmallApples() {
        int result = applePicker.pick(redPremiumApplePredicate, redApple);
        assertThat(result).isEqualTo(0);
    }



}