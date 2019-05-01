package code.examples.predicate;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PremiumApplePickerTest {

    private Apple premiumRedApple = new Apple("Pippin", "red", 250);
    private Apple redApple = new Apple("Pippin", "red", 100);

    private PremiumApplePicker applePicker = new PremiumApplePicker();

    @Test
    public void ripeApplesGreaterThan200GrammesShouldBePicked() {
        int result = applePicker.pick(premiumRedApple);
        assertThat(result).isEqualTo(premiumRedApple.getWeight());

    }

    @Test
    public void ripeApplesLessThan199GrammesShouldNotBePicked() {
        int result = applePicker.pick(redApple);
        assertThat(result).isEqualTo(0);

    }
}