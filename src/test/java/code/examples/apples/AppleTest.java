package code.examples.apples;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class AppleTest {

    @Test
    public void getAppleWeight() {
        Apple apple = new MetricApple("Pippin", "Green", 100);
        assertThat(apple.getWeight()).isEqualTo(100);
    }

    @Test
    public void getBadAppleWeight() {
        Apple apple = new BadApple("Pippin", "Green", 100);
        assertThat(apple.getWeight()).isEqualTo(1000);
    }

    /*
      Because we declare apple to be of type Apple rather than BigApple
      we cannot call the additional methods on BigApple
     */
    @Test
    public void getBigAppleAsApple() {
        Apple apple = new BigApple("Pippin", "Green", 100, "Apples-R-Us");
//        Will not compile as type is Apple not BigApple
//        assertThat(apple.getGrowerName()).isEqualTo("Apples-R-Us");

    }

    /*
        Here we declare apple to be of type BigApple so we
       can call the additional methods on BigApple
     */
    @Test
    public void getBigAppleAsBigApple() {
        BigApple bigApple = new BigApple("Pippin", "Green", 100, "Apples-R-Us");
        assertThat(bigApple.getGrowerName()).isEqualTo("Apples-R-Us");
    }


    /*
      Here we explicitly cast apple from Apple to BigApple so that we can access the additional methods.
      We can only do this because we know the class we instantiated was a BigApple

      It is rare that you write code explicitly casting - unless it is overriding the equals method of a class
      Plus normally you would check that it is safe to cast an object first
    */
    @Test
    public void getBigAppleAsBoth() {
        Apple apple = new BigApple("Pippin", "Green", 100, "Apples-R-Us");

        BigApple bigApple = (BigApple) apple;
        assertThat(bigApple.getGrowerName()).isEqualTo("Apples-R-Us");
    }
}