package code.examples.pickers;

import code.examples.apples.Apple;
import code.examples.apples.MetricApple;
import code.examples.pickers.PremiumApplePicker;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PremiumApplePickerTest {

    private Apple premiumRedApple = new MetricApple("Pippin", "red", 250);
    private Apple redApple = new MetricApple("Pippin", "red", 100);

    private PremiumApplePicker applePicker = new PremiumApplePicker();

    @Test
    public void ripeApplesGreaterThan200GrammesShouldBePicked() {
        double result = applePicker.pick(premiumRedApple);
        assertThat(result).isEqualTo(premiumRedApple.getWeight());

    }

    @Test
    public void ripeApplesLessThan199GrammesShouldNotBePicked() {
        double result = applePicker.pick(redApple);
        assertThat(result).isEqualTo(0);

    }
}