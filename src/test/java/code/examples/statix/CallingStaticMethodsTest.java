package code.examples.statix;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
     This is based on an example question
     See https://learn.oracle.com/education/downloads/Exam808_SampleQuestion.pdf
     question 3

 */
public class CallingStaticMethodsTest {

    /*
     This example is the same as the one in the Exam808_SampleQuestion.pdf
     It calls a static method from an instance of Writer - something you should never do

     Because w is declared as type Writer rather than Programmer
     the method defined on Writer is called
     */
    @Test
    public void badWayToAccessWriterV1() {
        Writer w = new Programmer();
       String result =  w.write();
        assertThat(result).isEqualTo("Writing...");
    }

    /*
    This example is the same as V1, but because w is declared as Programmer -
     the write method from programmer is used.

     You should still never do this
    */
    @Test
    public void badWayToAccessWriterV2() {
        Programmer w = new Programmer();
        String result =  w.write();
        assertThat(result).isEqualTo("Programmer writing code");
    }

    /*
     Accessing the static write method of Writer from the Class definition
     This is the correct way to call a static method - plus it's really clear
     which method will get called
     */
    @Test
    public void write2c() {
        String result =  Writer.write();
        assertThat(result).isEqualTo("Writing...");
    }

    /*
     Accessing the static write method of Programmer from the Class definition
     This is the correct way to call a static method
     */

    @Test
    public void write2() {
        String result =  Programmer.write();
        assertThat(result).isEqualTo("Programmer writing code");
    }
}