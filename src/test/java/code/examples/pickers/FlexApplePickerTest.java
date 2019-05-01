package code.examples.pickers;

import code.examples.apples.Apple;
import code.examples.apples.MetricApple;
import code.examples.pickers.FlexApplePicker;
import org.junit.Test;

import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

public class FlexApplePickerTest {

    private Apple premiumRedApple = new MetricApple("Pippin", "red", 250);
    private Apple redApple = new MetricApple("Pippin", "red", 100);
    private Apple greenApple = new MetricApple("Pippin", "green", 250);

    private FlexApplePicker applePicker = new FlexApplePicker();


    /*
      This version uses an inline Predicate - therefore does not need a return
      Because this version declares the type of the parameter (which is not strictly necessary in this example)
       the argument is in brackets (Apple apple) ->
    */
    private Predicate<Apple> redApplePredicate =  (Apple apple) -> apple.getColour().equals("red");

    @Test
    public void flexApplePickerShouldPickRedApples() {
        int result = applePicker.pick(redApplePredicate, redApple);
        assertThat(result).isEqualTo(redApple.getWeight());
    }

    /*
      This version uses a predicate without declaring it first
     */
    @Test
    public void flexApplePickerShouldPickRedApplesVersion2() {
        int result = applePicker.pick(apple -> apple.getColour().equals("red"), redApple);
        assertThat(result).isEqualTo(redApple.getWeight());
    }



    @Test
    public void flexApplePickerShouldNotPickGreenApples() {
        int result = applePicker.pick(redApplePredicate, greenApple);
        assertThat(result).isEqualTo(0);
    }


    /*
       Example of block lambda
       When using braces {} the return is mandatory
       (if the function returns a value - which Predicate does)
     */


    private Predicate<Apple> redPremiumApplePredicate = apple -> {
        boolean result = false;
        if (apple.getColour().equals("red") && apple.getWeight() > 199) {
            result = true;
        }
        return result;

    };

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